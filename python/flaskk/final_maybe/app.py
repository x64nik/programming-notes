from flask import Flask, render_template, request, flash
from flask_sqlalchemy import SQLAlchemy
from sqlalchemy.exc import SQLAlchemyError
app = Flask(__name__, template_folder="templates")


app.debug = True


app.config['SQLALCHEMY_DATABASE_URI'] = 'oracle+cx_oracle://hr:hr@127.0.0.1:1521/xe'

db = SQLAlchemy(app)


# creation of table

class Book(db.Model):

    BOOK_ID = db.Column(db.Integer(), primary_key=True)
    BOOK_NAME = db.Column(db.String(20), unique=False, nullable=False)
    BOOK_AUTHOR = db.Column(db.String(20), unique=False, nullable=False)
    BOOK_PRICE = db.Column(db.Integer())


# Main Page end point

@app.route('/')
def index():
    return stuInfo()


# Add end point Logic
@app.route("/add", methods=['GET', 'POST'])
def stuInfo():
    if request.method == "POST":
        bookId = int(request.form.get('bookId'))
        bookName = request.form.get('bookName')
        bookAuthor = request.form.get('bookAuthor')
        bookPrice = int(request.form.get('bookPrice'))

        entry = Book(BOOK_ID=bookId, BOOK_NAME=bookName,
                     BOOK_AUTHOR=bookAuthor, BOOK_PRICE=bookPrice)

        db.session.add(entry)
        db.session.commit()

    Books = Book.query.all()

    return render_template("index.html", Books=Books)


# HTML embeded with Flask

str = '''

<h1 style="color:red;margin-top:5rem"><center>Invalid Id..Try Again !!<center></h1>
<h1 style="color:black;margin-top:5rem"><center>Go To Home click here... !!<center></h1>
<h1 style="color:black;margin-top:10px"><center><a href="/home">Home</a></li><center></h1>

'''

# Delete end point logic


@app.route('/delete', methods=["POST", "GET"])
def erase():
    BOOK_ID = request.form.get('bookId')
    try:
        data = Book.query.get(BOOK_ID)

        db.session.delete(data)
        db.session.commit()
        Books = Book.query.all()

        return render_template("index.html", Books=Books)
    except SQLAlchemyError as e:
        return str


# Update end point logic
@app.route('/update', methods=["POST", "GET"])
def myfun():
    try:

        bookId = request.form.get('BOOK_ID')
        newPrice = request.form.get('BOOK_PRICE')
        user = Book.query.get(bookId)
        user.BOOK_PRICE = newPrice
        db.session.commit()

        Books = Book.query.all()
        return render_template("index.html", Books=Books)
    except:
        return str


# search Book end point
# @app.route("/search", methods=['GET', 'POST'])
# def stuInfo():
#     if request.method == "POST":
#         bookName = request.form.get('bookName')

#         entry = Book(BOOK_NAME=bookName,
#                      )

#         db.session.add(entry)
#         db.session.commit()

#     Books = Book.query.all()

#     return render_template("index.html", Books=Books)


# Add end point

@app.route('/addpage')
def add():
    return render_template("add.html")

# Delete end point


@app.route('/deletepage')
def fun():
    return render_template('delete.html')

# Update end point


@app.route('/updatepage')
def update():
    return render_template('update.html')


@app.route('/searchpage')
def search():
    return render_template('search.html')

# 404 error handler end point


@app.errorhandler(404)
def handle(error):
    return '<img src="/static/images/404img.png" width=100% height=100%>'


@app.errorhandler(Exception)
def handle(error):
    return '<img src="/static/images/404img.png"B width=100% height=100%>'


@app.route('/home')
def home():
    Books = Book.query.all()
    return render_template("index.html", Books=Books)


if __name__ == "__main__":
    app.run()
