package exception;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {
    public void dosome() throws IOException, AWTException {
    }

    ;

    public void dosome1() throws IOException, AWTException {
    }

    ;

    public void dosome2() throws IOException, AWTException {
    }

    ;
}

class subClass extends ThrowsDemo {

    //允许子类方法仅抛出超类方法声明抛出异常的一部分
    @Override
    public void dosome() throws IOException {
    }

    //    允许不再抛出任何异常
    @Override
    public void dosome1() {
    }


    //    允许抛出超类方法抛出异常的子类型异常
    @Override
    public void dosome2() throws FileNotFoundException {
    }

    //不允许抛出额外异常（超类方法没有声明抛出的，且与声明抛出的异常没继承关系
//    public void dosome() throws SQLException{};

    //不允许抛出超类方法抛出异常的超类型异常
//    public void dosome() throws Exception{}
}