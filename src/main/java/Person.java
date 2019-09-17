/**
 * @program First
 * @description:
 * @author:
 * @create:2019-09-17 10:39:09
 **/

public class Person {
    private Tool tool;
/*
    public Person(){
        tool = new Tool();
    }
*/

    public Person(Tool tool){
        this.tool = tool;
    }
    public void doT(){
        tool.doThings();
    }
}
