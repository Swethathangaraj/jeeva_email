from tkinter import*
root=Tk()
entry=Entry(root,font=('Times_New_Roman',30))
entry.pack()
label=label(root,font=('Times_New_Roman',30))
def cal():
    label.config(text='' +str(eval(entry.get())))
    label.pack()
button=Button(root,text=('calculate',font=('Times_New_Roman',30),command=cal))
button.pack()
root.mainloop()
