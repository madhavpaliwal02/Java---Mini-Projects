public class Student_Management {

}


/*#include <iostream>
#include <fstream>
using namespace std;

        int studentView();
        int studentLogin();
        int studentRegistration();
        int adminView();
        int adminLogin();
        int studentListDetails();
        int studentListByUsername();
        int delay();

        int studentListByUsername()
        {
        ifstream display;
        display.open("User.dat", ios::in);

        if (display)
        {
        string line;
        while (getline(display, line))
        {
        cout << line << endl;
        }
        display.close();
        }
        else
        {
        cout << "\n No Record found :(";
        }
        cout << "\n Please any key to continue..";
        getchar();
        getchar();
        return 0;
        }

        int studentListDetails()
        {
        ifstream display;
        display.open("Data.dat", ios::in);

        if (display)
        {
        string line;
        while (getline(display, line))
        {
        cout << line << endl;
        }
        display.close();
        }
        else
        {
        cout << "\n No Record found :(";
        }
        cout << "\n Please any key to continue..";
        getchar();
        getchar();
        return 0;
        }

        int studentView()
        {
        system("cls");
        int lecture, choice;
        cout << "--------------- STUDENT ATTENDANCE PORTAL --------------\n";
        cout << "\nEnter no of lectures : ";
        cin >> lecture;
        char attendance[10];
        cout << "\n1. Mark my Present ";
        cout << "\n2. Mark my Absent \n";
        for (int i = 0; i < lecture; i++)
        {
        cout << "Enter choice : ";
        cin >> choice;
        switch (choice)
        {
        case 1:
        attendance[i] = 'P';
        break;
        case 2:
        attendance[i] = 'A';
        break;
        default:
        cout << "Enter a valid no : ";
        break;
        }
        }
        cout << "Your Today's Attendance is : ";
        for (int ii = 0; ii < lecture; ii++)
        {
        cout << endl
        << attendance[ii];
        }
        return 0;
        }

        int adminLogin()
        {
        system("cls");
        cout << "--------------- ADMIN LOGIN --------------\n";
        string username, password;
        cout << "\nEnter Username : ";
        cin >> username;
        cout << "\nEnter Password : ";
        cin >> password;

        if (username == "admin" && password == "admin@2")
        {
        adminView();
        getchar();
        }
        else
        {
        cout << "\nError";
        getchar();
        }
        return 0;
        }

        int adminView()
        {
        system("cls");
        cout << "--------------- ADMIN PORTAL --------------\n";
        int choice;
        cout << "\n1. STUDENT REGISTRATION";
        cout << "\n2. STUDENT LIST WITH DEATILS";
        cout << "\n3. STUDENT LIST BY USERNAME";
        cout << "\n0. EXIT";
        cout << "\n\nEnter a choice : ";
        cin >> choice;

        switch (choice)
        {
        case 1:
        studentRegistration();
        break;
        case 2:
        studentListDetails();
        break;
        case 3:
        studentListByUsername();
        break;
        case 0:
        cout << "\nEXIT";
        break;
        default:
        cout << "Enter a valid no : ";
        getchar();
        }
        return 0;
        }

        int studentRegistration()
        {
        system("cls");
        cout << "--------------- STUDENT REGISTRATION --------------\n";
        string name, username, password, rollno;
        cout << "\nEnter Name : ";
        cin >> name;
        cout << "\nEnter Roll No. : ";
        cin >> rollno;
        cout << "\nEnter Username : ";
        cin >> username;
        cout << "\nEnter Password : ";
        cin >> password;

        ifstream read;
        read.open("User.dat");
        if (read)
        {
        string line;
        while (getline(read, line))
        {
        if (line == username)
        {
        cout << "Username already exist !";
        getchar();
        getchar();
        delay();
        read.close();
        return 0;
        }
        }
        }
        read.close();

        ofstream out1;

        out1.open("Data.dat", ios::app | ios::out);
        out1 << name
        << "\n";
        out1 << rollno
        << "\n";
        out1 << username
        << "\n\n";
        out1.close();

        out1.open("User.dat", ios::app);
        out1 << username
        << "\n";
        out1.close();

        out1.open("Pass.dat", ios::app);
        out1 << password
        << "\n\n";
        out1.close();

        cout << "\nRegistration Successfully !";
        cout << "\nPress any key to continue...";
        getchar();
        getchar();
        return 0;
        }

        int studentLogin()
        {
        system("cls");
        cout << "--------------- STUDENT LOGIN --------------\n";
        string username, password;
        cout << "\nEnter Username : ";
        cin >> username;
        cout << "\nEnter Password : ";
        cin >> password;

        ifstream read;
        read.open("Pass.dat");
        if (read)
        {
        string line;
        while (getline(read, line))
        {
        if (line == password)
        {
        studentView();
        break;
        }
        else
        {
        cout << "\nIncorrect Username & Password !!";
        break;
        }
        }
        }
        return 0;
        }

        int main()
        {
        system("cls");
        cout << "--------------- ATTENDANCE MANAGEMENT SYSTEM ---------------\n";
        cout << "\n1. STUDENT ";
        cout << "\n2. ADMIN ";
        int choice;
        cout << "\nEnter choice : ";
        cin >> choice;

        switch (choice)
        {
        case 1:
        studentLogin();
        break;
        case 2:
        adminLogin();
        break;
        default:
        cout << "Enter a valid no : ";
        break;
        }
        return 0;
        }

        int delay()
        {
        for (int i = 0; i < 3; i++)
        {
        cout << "\n Saving Records ...";
        for (int ii = 0; ii < 20000; ii++)
        {
        for (int iii = 0; iii < 20000; iii++)
        {
        }
        }
        }

        cout << "\n Exiting Now ...";
        for (int i = 0; i < 3; i++)
        {
        for (int ii = 0; ii < 20000; ii++)
        {
        for (int iii = 0; iii < 20000; iii++)
        {
        }
        }
        }

        }*/
