#!/usr/bin/python3


from flask import *

app = Flask(__name__)

@app.route('/')
def root_rout():
	return render_template("index.html")

@app.route('/test')
def test_rout():
	return render_template("test.html")

@app.route('/decode', methods=['POST', 'GET'])
def decode_rout():
	if request.method == 'POST':
		name = request.form['nm']
		return redirect(url_for('success', name=user))
	else:
		user = request.args.get('nm')
		return redirect(url_for('success', name=user))

		# return render_template("decode.html")

# @app.route('/test/<name>')
# def test_rout(name):
# 	return name



if __name__ == '__main__':
	app.run(debug=True) 