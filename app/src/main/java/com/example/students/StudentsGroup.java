package com.example.students;
import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {
    private String number;
    private String facultyName;
    private int educationLevel;
    private boolean contractExistsFlg;
    private boolean privilageExistsFlg;

    public StudentsGroup(String number, String facultyName,int educationLevel,boolean contractExistsFlg,boolean privilageExistsFlg){
        this.number=number;
        this.facultyName=facultyName;
        this.educationLevel=educationLevel;
        this.contractExistsFlg=contractExistsFlg;
        this.privilageExistsFlg=privilageExistsFlg;
    }
    public String getNumber(){
        return number;
    }
    public String getFacultyName(){
        return facultyName;
    }
    public int getEducationLevel(){
        return educationLevel;
    }
    public boolean isContractExistsFlg(){
        return contractExistsFlg;
    }
    public boolean isPrivilageExistsFlg(){
        return privilageExistsFlg;
    }
    private final static ArrayList<StudentsGroup> groups=new ArrayList<StudentsGroup>(Arrays.asList(

            new StudentsGroup("301","Комп'ютерних наук",0,true,false),
            new StudentsGroup("302","Комп'ютерних наук",0,true,false),
            new StudentsGroup("501M","Комп'ютерних наук",1,false,true),
            new StudentsGroup("308","Комп'ютерних наук",0,true,false),
            new StudentsGroup("309","Комп'ютерних наук",0,true,true)
    ));
    public static StudentsGroup getGroup(String groupNumber){
        for(StudentsGroup g:groups){
            if(g.getNumber().equals(groupNumber)){
                return g;
            }
        }
        return null;
    }
}