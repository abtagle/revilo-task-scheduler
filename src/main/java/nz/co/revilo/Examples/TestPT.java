package nz.co.revilo.Examples;//####[1]####
//####[1]####
//-- ParaTask related imports//####[1]####

import pt.runtime.ParaTask;
import pt.runtime.TaskID;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//####[1]####
public class TestPT {//####[3]####
    static{ParaTask.init();}//####[3]####
    /*  ParaTask helper method to access private/protected slots *///####[3]####
    public void __pt__accessPrivateSlot(Method m, Object instance, TaskID arg, Object interResult ) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {//####[3]####
        if (m.getParameterTypes().length == 0)//####[3]####
            m.invoke(instance);//####[3]####
        else if ((m.getParameterTypes().length == 1))//####[3]####
            m.invoke(instance, arg);//####[3]####
        else //####[3]####
            m.invoke(instance, arg, interResult);//####[3]####
    }//####[3]####
}//####[3]####
