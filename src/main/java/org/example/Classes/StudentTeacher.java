package org.example.Classes;

import org.example.interfaces.Student;
import org.example.interfaces.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudentTeacher extends Person implements Student, Teacher
{

    List<Curso> cursosInscritos = new ArrayList<>();
    List<Curso> cursosImpartidos = new ArrayList<>();
    @Override
    public void matricularCurso() {

    }

    @Override
    public void entregarTarea() {

    }

    @Override
    public void calificarExam() {

    }

    @Override
    public void assignTask() {

    }
}
