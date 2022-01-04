//package tasks;
//import java.util.ArrayList;
//import java.util.List;
//public class EasyBalanceChecking {
//    public List Check() { // with arguments
//        List check = new ArrayList();
//        return check;
//    }
//    public List Id() {
//        List Id = new ArrayList();
//        Id.add(1);
//        Id.add(2);
//        Id.add(3);
//        Id.add(4);
//        Id.add(5);
//        return Id;
//    }
//
//    public List Catefory() {
//        List category = new ArrayList();
//        category.add("Market");
//        category.add("Hardware");
//        category.add("Video");
//        category.add("Book");
//        category.add("Gasoline");
//        return category;
//    }
//
//    public List Amount() {
//        List amount = new ArrayList();
//        amount.add(125.45);
//        amount.add(34.95);
//        amount.add(7.45);
//        amount.add(14.32);
//        amount.add(16.10);
//        return amount;
//    }
//
//
//
//    public void MakeToArr(){
//        float originalBalance = 1000f;
//        float Total_expense = 0f;
//        float Average_expense;
//
//        CheckForEBC test = new CheckForEBC();
//
//        List OurString = new ArrayList<>();
//        boolean s = true;
//        while (s){
//            for(int i=0; i<5; i++) {
//
//                OurString.add(test.Id().get(i).toString() + "_" + test.Catefory().get(i).toString() + "_" + test.Amount().get(i).toString() +
//                        "_Balance"+"_"+(originalBalance - Float.parseFloat(test.Amount().get(i).toString()))
//                        +"\n");
//            }
//
//            System.out.println(OurString);
//
//            s=false;
//        }
//    }
//
//    public void MakeToString(){
//        float originalBalance = 1000f;
//        float Total_expense = 0f;
//        float Average_expense;
//
//        CheckForEBC test = new CheckForEBC();
//        List OurString = new ArrayList<>();
//        boolean s = true;
//        while (s){
//            for(int i=0; i<5; i++) {
//                OurString.add(test.Id().get(i).toString() + "_" + test.Catefory().get(i).toString() + "_" + test.Amount().get(i).toString() +
//                        "_Balance"+"_"+(originalBalance - Float.parseFloat(test.Amount().get(i).toString()))+"\n"
//                );
//
//            }
//            String OurStr = "";
//
//            for(int i=0; i<OurString.size(); i++){
//                OurStr+=OurString.get(i).toString();
//
//            }
//            System.out.println(OurStr);
//
//            s=false;
//        }
//
//    }
//
//
//    public static void main(String args[]) {
//
//        float originalBalance = 1000f;
//        float Total_expense = 0f;
//        float Average_expense;
//
//
//
//        CheckForEBC xx = new CheckForEBC();
//
//        xx.MakeToString();
////        xx.MakeToArr();
//
//    }
//}
