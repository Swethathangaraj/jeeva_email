from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText
from email.mime.image import MIMEImage
from pathlib import Path
import os
import smtplib 


message=MIMEMultipart()
message['from']="swetha"
message['to']="zukat235@gmail.com"
message['subject']="This is a test"
message['cc']="jeevat0123@gmail.com,monkeymindbusiness@gmail.com"
message.attach(MIMEText("hey"))
message.attach(MIMEImage(Path("bts.jpeg").read_bytes()))

with smtplib.SMTP(host="smtp.gmail.com",port=587) as smtp:
    smtp.ehlo()
    smtp.starttls()
    smtp.login(os.environ.get("FROMEMAIL"),os.environ.get("PASSWORD"))
    smtp.send_message(message)
    print("sent!")
