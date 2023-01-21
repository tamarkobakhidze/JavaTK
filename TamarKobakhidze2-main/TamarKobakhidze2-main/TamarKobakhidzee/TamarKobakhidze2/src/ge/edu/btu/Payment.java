package ge.edu.btu;

import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Payment {

    public static Logger logger=LogManager.getLogger(Payment.class);


    public static void main(String[] args) {
        Electricity electricity=new Electricity("tako",4);
        Water water=new Water("beka",32);
        genericPrint(electricity);
        genericPrint(water);





    }


    public static  <T> void genericPrint(T a) {
        logger.log(Level.INFO,"კომუნალურები გახადილია:"+a.toString());

    }

//    res ან resource ფაილი გახადე resource დირექტორია (მარჯვენა კლიკი ფაილზე მერე mark directory as და აირჩევ resource

//    log4j ის კონფიგურაციის ფაილში ანუ resource ფაილში (რომელსაც ზემოთ დააყენებ იმაში) შეცვალე მე-14 ხაზზე ტოლობის მერე
//    არსებული სტრინიგი log ფაილში მოთავსებული info.log ის full path ით (მარჯვენა კნოპკა info.log ზე მერე copy path/reference
//    მერე დააჭირე full path-ს და ჩასვი მე-14 ხაზის ტოლობის შემდეგ!!!!!

////    log4j ის კონფიგურაციის ფაილში ანუ resource ფაილში (რომელსაც ზემოთ დააყენებ იმაში) შეცვალე მე-14 ხაზზე ტოლობის მერე
////    არსებული სტრინიგი log ფაილში მოთავსებული error.log ის full path ით (მარჯვენა კნოპკა error.log ზე მერე copy path/reference
////    მერე დააჭირე full path-ს და ჩასვი 22-ე ხაზის ტოლობის შემდეგ!!!!!


}
