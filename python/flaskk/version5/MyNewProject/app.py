from flask import Flask, render_template, request, flash, session, redirect
from flask_sqlalchemy import SQLAlchemy
from sqlalchemy.exc import SQLAlchemyError
import hash_creds

app = Flask(__name__, template_folder="templates")


app.config['SQLALCHEMY_DATABASE_URI'] = 'oracle+cx_oracle://hr:hr@127.0.0.1:1521/xe'

db = SQLAlchemy(app)

app.secret_key = 'saish'


# creation of table
class Book(db.Model):

    BOOK_ID = db.Column(db.Integer(), primary_key=True)
    BOOK_NAME = db.Column(db.String(20), unique=False, nullable=False)
    BOOK_AUTHOR = db.Column(db.String(20), unique=False, nullable=False)
    BOOK_PRICE = db.Column(db.Integer())





# Add end point Logic
@app.route("/add", methods=['GET', 'POST'])
def stuInfo():
    try:
        session['email']
        try:
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

        except:
            return "<script LANGUAGE='JavaScript'>window.alert('ID Already Exit');window.location.href='/home';</script>"
    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# HTML embeded with Flask
# str = '''

# <h1 style="color:red;margin-top:5rem"><center>Invalid Id..Try Again !!<center></h1>
# <h1 style="color:black;margin-top:5rem"><center>Go To Home click here... !!<center></h1>
# <h1 style="color:black;margin-top:10px"><center><a href="/home">Home</a></li><center></h1>

# '''


# Delete end point logic ---->  Model
@app.route('/delete', methods=["POST", "GET"])
def erase():
    try:
        session['email']
        BOOK_ID = request.form.get('bookId')
        try:
            data = Book.query.get(BOOK_ID)
            db.session.delete(data)
            db.session.commit()
            Books = Book.query.all()
            return render_template("index.html", Books=Books)

        except SQLAlchemyError as e:
            return "<script LANGUAGE='JavaScript'>window.alert(' Invalid Id...Try Again !! ');window.location.href='/deletepage';</script>"
    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# Update end point logic ----->  Model
@app.route('/update', methods=["POST", "GET"])
def myfun():
    try:
        session['email']
        try:
            bookId = request.form.get('BOOK_ID')
            newPrice = request.form.get('BOOK_PRICE')
            user = Book.query.get(bookId)
            user.BOOK_PRICE = newPrice
            db.session.commit()

            Books = Book.query.all()
            return render_template("index.html", Books=Books)
        except:
            return "<script LANGUAGE='JavaScript'>window.alert(' Invalid Id...Try Again !! ');window.location.href='/updatepage';</script>"

    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# Add end point
@app.route('/addpage')
def add():
    try:
        session['email']
        return render_template("add.html")
    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# Update end point
@app.route('/updatepage')
def update():
    try:
        session['email']
        return render_template('update.html')
    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# Delete end point
@app.route('/deletepage')
def fun():
    try:
        session['email']
        return render_template('delete.html')
    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# Home End Point
@app.route('/home')
def home():
    try:
        session['email']
        Books = Book.query.all()
        return render_template("index.html", Books=Books)
    except KeyError:
        return "<script LANGUAGE='JavaScript'>window.alert('Session Timeout');window.location.href='/';</script>"


# Login End Point
@app.route('/login')
def default_login():
    return render_template("login.html")


# Main Page of website ------> Model
@app.route('/')
def login():
    creds_file = open("creds.txt", "r")
    creds_data = creds_file.read()
    try:
        if session['email'] in creds_data:
            return render_template("index.html")
        else:
            return redirect("/books")
    except KeyError:
        return redirect("/login")
    finally:
        creds_file.close()


# SIGNUP FORM --------> Model
@app.route('/success', methods=['GET', 'POST'])
def signup():
    if request.method == "POST":
        # open creds file to check and insert
        creds_file = open("creds.txt", "r")
        creds_data = creds_file.read()

        uname = request.form.get('uname')
        email = request.form.get('email')
        passwd = request.form.get('passwd')

        # hashed creds
        hashed_data = hash_creds.hash(email, passwd)

        try:
            if hashed_data in creds_data:
                creds_file.close()
                return "<script LANGUAGE='JavaScript'>window.alert('User Already Exists ⚠️ Please Sign In !!');window.location.href='/login';</script>"

            else:
                session['email'] = hashed_data
                creds_file = open("creds.txt", "a")
                creds_file.write(hashed_data + "\n")
                creds_file.close()
                return "<script LANGUAGE='JavaScript'>window.alert(' Signup Successfully ✅ ');window.location.href='/home';</script>"
        except KeyError:
            return redirect("/")
        finally:
            creds_file.close()
    return redirect('/')


@app.route('/books', methods=['GET', 'POST'])
def index():
    if request.method == "POST":
        email = request.form.get('email')
        passwd = request.form.get('passwd')
        hashed_data = hash_creds.hash(email, passwd)
        creds_file = open("creds.txt", "r")
        creds_data = creds_file.read()
        try:
            if session['email'] in hashed_data:
                return render_template("index.html")
            elif hashed_data in creds_data:
                return render_template("index.html")
            else:
                return render_template("login.html")

        except KeyError:
            if hashed_data in creds_data:
                session['email'] = hashed_data
                return redirect('/home')
        finally:
            creds_file.close()

    return "<script LANGUAGE='JavaScript'>window.alert('Invalid Credential ⚠️ ');window.location.href='/';</script>"


# Logout End Point
@app.route('/logout')
def logout():
    creds_file = open("creds.txt", "r")
    creds_data = creds_file.read()
    try:
        if session['email'] in creds_data:
            session.pop('email', None)
            return render_template("login.html")
        else:
            return '<p>User Already Loggedout</p>'
    except KeyError:
        return redirect("/")
    finally:
        creds_file.close()


# 404 error handler end point
@app.errorhandler(404)
def handle(error):
    return "<script LANGUAGE='JavaScript'>window.alert('Server Side Error Occurred, Please Return to Home⚠️ ');window.location.href='/';</script>"

# All kind of error are handle
@app.errorhandler(Exception)
def handle(error):
    return "<script LANGUAGE='JavaScript'>window.alert('Server Side Error Occurred, Please Return to Home⚠️ ');window.location.href='/';</script>"





if __name__ == "__main__":
    app.run(host='0.0.0.0', port=80, debug=True)
