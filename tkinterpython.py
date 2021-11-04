from tkinter import*

root = Tk()
root.title("Simple Calculator")
e = Entry(root, width=50)
e.pack()
e.insert(0,"Enter Your Name: ")


myButton = Button(root, text="Enter Your Stock Quote")
myButton.pack()


root.mainloop()

