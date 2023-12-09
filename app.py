from flask import Flask
import time
app = Flask(__name__)

@app.route("/")
def main():
    time.sleep(100)
    return 'hello'

if __name__ == '__main__':
    app.run()