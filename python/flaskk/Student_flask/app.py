#!/usr/bin/python3

from flask import *

app = Flask(__name__)

@app.route('/')
def root_rout():
	return render_template("index.html")


@app.route("/studinfo", methods=['GET', 'POST'])
def stud_entry():
	if request.method == 'POST':
		studid = request.form.get('studid')
		name = request.form.get('name')
		age = request.form.get('age')
		marks = request.form.get('marks')

		return studid + name + age + marks



if __name__ == '__main__':
	app.run(debug=True)
