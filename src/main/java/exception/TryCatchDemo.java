package exception;

public class TryCatchDemo {
    public static void main(String[] args) {
        System.out.println("程序开始");
        try{
//            String line = null;
//            String line ="";
            String line = "abc";
            System.out.println(line.length());
            System.out.println(line.charAt(0));
            System.out.println(Integer.parseInt(line));
        }
        catch (NumberFormatException e) {
            System.out.println("转换错误");
        }
//        catch (NullPointerException | StringIndexOutOfBoundsException e){
//            System.out.println("同时处理异常");
//        }
//        catch (NullPointerException e){
//            e.printStackTrace();
//            System.out.println("程序空指针");
//        }catch (StringIndexOutOfBoundsException e){
//            e.printStackTrace();
//            System.out.println("出现了字符串下标越界");
//        }
        System.out.println("程序结束");
    }
}
