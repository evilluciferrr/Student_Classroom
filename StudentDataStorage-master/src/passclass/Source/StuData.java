/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passclass.Source;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 10.1803
 */
public class StuData {
    
    private String StuCode;
    private String Name;
    private String Grade;
    private String TypeClass;

    private static List<String> data = new ArrayList<>();

    static {
        data.add("123,A1 B,1.00,IEP");
        data.add("456,A2 B,1.00,IEP");
        data.add("789,A3 B,1.00,IEP");
    }

    public void tranData(){
        String[] arr = new String[0];
        int cnt = 0;
        for (int i = 0; i < data.size() ; i++) {
            System.out.println(data.get(i));
            arr = data.get(i).split(",");
            
            if (cnt == arr.length-4){
                setStuCode(arr[0]);
            }
            if (cnt+1 == arr.length-3){
                setName(arr[1]);
            }
            if (cnt+2 == arr.length-2){
                setGrade(arr[2]);
            }
            if (cnt+3 == arr.length-1){
                setTypeClass(arr[3]);
            }

            System.out.println(getStuCode());
            System.out.println(getName());
            System.out.println(getGrade());
            System.out.println(getTypeClass());
        }
        System.out.println(arr.length);
    }


    public String getStuCode() {
        return StuCode;
    }

    public void setStuCode(String stuCode) {
        StuCode = stuCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getTypeClass() {
        return TypeClass;
    }

    public void setTypeClass(String typeClass) {
        TypeClass = typeClass;
    }
}
