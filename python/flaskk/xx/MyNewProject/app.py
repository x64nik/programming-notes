from sqlite3 import DatabaseError
from flask import Flask,render_template ,request,redirect
from flask_sqlalchemy import SQLAlchemy
from sqlalchemy.exc import SQLAlchemyError


app = Flask(__name__, template_folder="templates")
  

app.debug = True
 

app.config['SQLALCHEMY_DATABASE_URI'] = 'oracle+cx_oracle://hr:hr@127.0.0.1:1521/xe'

db = SQLAlchemy(app)

# Models
class Book(db.Model):
    
    BOOK_ID = db.Column(db.Integer(), primary_key=True)
    BOOK_NAME = db.Column(db.String(20), unique=False, nullable=False)
    BOOK_AUTHOR = db.Column(db.String(20), unique=False, nullable=False)
    BOOK_PRICE= db.Column(db.Integer())
    
    # represent object of database table
    def __repr__(self):
       pass
    
@app.route('/')
def index():
    return render_template("index.html")


@app.route("/add", methods = ['GET','POST'])
def stuInfo():
    if request.method == "POST":
        bookId = int(request.form.get('bookId'))
        bookName = request.form.get('bookName')
        bookAuthor = request.form.get('bookAuthor')
        bookPrice = int(request.form.get('bookPrice'))
        
        entry = Book(BOOK_ID = bookId, BOOK_NAME = bookName, BOOK_AUTHOR=bookAuthor, BOOK_PRICE = bookPrice )
        
        db.session.add(entry)
        db.session.commit()   
        
    Books = Book.query.all()
    
    return render_template("index.html", Books = Books)
    


@app.route('/delete',methods=["POST","GET"])
def erase():
    BOOK_ID = request.form.get('bookId')
    try:
        data = Book.query.get(BOOK_ID)
    except SQLAlchemyError as e:
        return "Hello I am error"
      
    db.session.delete(data)
    db.session.commit()
    Books = Book.query.all()
    
    return render_template("index.html", Books = Books)
    
@app.route('/addpage')
def add():
    return render_template("add.html")

@app.route('/deletepage')
def fun():
    return render_template('delete.html')

@app.route('/updatepage')
def update():
    return render_template('update.html')
    
@app.route('/refresh')
def refresh():
    Books = Book.query.all()
    return render_template("index.html", Books = Books)

@app.route('/update',methods=["POST","GET"])
def myfun():
    bookId = request.form.get('BOOK_ID')
    newPrice = request.form.get('BOOK_PRICE');
    user = Book.query.get(bookId)
    user.BOOK_PRICE = newPrice;
    db.session.commit()
    
    Books = Book.query.all()
    return render_template("index.html", Books = Books)




if __name__ == "__main__":
    app.run(host='0.0.0.0')
    
