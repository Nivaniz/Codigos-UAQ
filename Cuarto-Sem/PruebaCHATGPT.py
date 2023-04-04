import tkinter as tk


class Employee:
    def __init__(self, name, surname, age, department):
        self.name = name
        self.surname = surname
        self.age = age
        self.department = department

    def __str__(self):
        return f"{self.name} {self.surname} ({self.age}) - {self.department}"


class App:
    def __init__(self, master):
        self.master = master
        self.master.title("AGCO MEXICO")

        self.frame1 = tk.Frame(self.master)
        self.frame1.pack()

        tk.Label(self.frame1, text="AGCO MEXICO", font=("Arial", 24)).pack(pady=50)

        tk.Button(self.frame1, text="Enter", font=("Arial", 16), command=self.open_employee_window).pack(pady=10)
        tk.Button(self.frame1, text="Close", font=("Arial", 16), command=self.master.quit).pack(pady=10)

        self.employee_list = []
        self.frame3 = None  # Inicializamos el atributo frame3

    def open_employee_window(self):
        if self.frame3:  # Si el frame ya existe, lo destruimos
            self.frame3.destroy()
        self.frame1.destroy()

        self.frame2 = tk.Frame(self.master)
        self.frame2.pack()

        tk.Label(self.frame2, text="Name:", font=("Arial", 16)).grid(row=0, column=0, padx=10, pady=10)
        self.name_entry = tk.Entry(self.frame2, font=("Arial", 16))
        self.name_entry.grid(row=0, column=1)

        tk.Label(self.frame2, text="Surname:", font=("Arial", 16)).grid(row=1, column=0, padx=10, pady=10)
        self.surname_entry = tk.Entry(self.frame2, font=("Arial", 16))
        self.surname_entry.grid(row=1, column=1)

        tk.Label(self.frame2, text="Age:", font=("Arial", 16)).grid(row=2, column=0, padx=10, pady=10)
        self.age_entry = tk.Entry(self.frame2, font=("Arial", 16))
        self.age_entry.grid(row=2, column=1)

        tk.Label(self.frame2, text="Department:", font=("Arial", 16)).grid(row=3, column=0, padx=10, pady=10)
        self.department_entry = tk.Entry(self.frame2, font=("Arial", 16))
        self.department_entry.grid(row=3, column=1)

        tk.Button(self.frame2, text="Save", font=("Arial", 16), command=self.save_employee).grid(row=4, column=0,
                                                                                                 pady=10)
        tk.Button(self.frame2, text="Delete", font=("Arial", 16), command=self.delete_employee).grid(row=4, column=1,
                                                                                                     pady=10)

        tk.Button(self.frame2, text="View Employees", font=("Arial", 16), command=self.view_employees).grid(row=5,
                                                                                                            columnspan=2,
                                                                                                            pady=50)

    def save_employee(self):
        name = self.name_entry.get()
        surname = self.surname_entry.get()
        age = self.age_entry.get()
        department = self.department_entry.get()

        employee = Employee(name, surname, age, department)
        self.employee_list.append(employee)

        self.name_entry.delete(0, tk.END)
        self.surname_entry.delete(0, tk.END)
        self.age_entry.delete(0, tk.END)
        self.department_entry.delete(0, tk.END)

    def delete_employee(self):
        if self.employee_list:
            self.employee_list.pop()

    def view_employees(self):
        self.frame2.destroy()
        self.frame3 = tk.Frame(self.master)
        self.frame3.pack()

        tk.Label(self.frame3, text="Employee List", font=("Arial", 24)).pack(pady=50)

        if self.employee_list:
            for index, employee in enumerate(self.employee_list):
                tk.Label(self.frame3,
                         text=f"{index + 1}. {employee.name} {employee.surname}, {employee.age}, {employee.department}",
                         font=("Arial", 16)).pack()
        else:
            tk.Label(self.frame3, text="No employees found.", font=("Arial", 16)).pack()

        tk.Button(self.frame3, text="Add Employee", font=("Arial", 16), command=self.open_employee_window).pack(
            pady=50)  # <-- added closing parenthesis here


if __name__ == '__main__':
    root = tk.Tk()
    app = App(root)
    root.mainloop()