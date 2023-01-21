import ge.edu.btu.Passenger;
import ge.edu.btu.Train;
import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class StationSquareTest {
    @Test
    public void test(){
        Passenger gio=new Passenger("gio",true);
        Passenger nika=new Passenger("nika",false);
        Passenger ana=new Passenger("ana",true);
        Train train=new Train();
        train.AddPassenger(gio);
        train.AddPassenger(nika);
        train.AddPassenger(ana);
        Assert.assertThat(train.getPassengerList(),hasItem(gio));
        Assert.assertThat(train.getPassengerList(),not(hasItem(nika)));
        Assert.assertThat(train.getPassengerList(),hasItem(ana));


//        გადმოწერე ჯუნიტი https://jar-download.com/artifacts/junit/junit/4.12/source-code აქედან.

//        ამოაარქივე და ორივე ჯარ ფაილი დაამატე პროექტის ბიბილოეთაკში (ზემოთ მარჯვნივ დააჭირე File მერე Project Structure
//        მერე libraries დააჭირე პლიუსს აირჩიე java და url ში მიაწოდე ის მნიშვნელობა სადაც ამოაარქივე შენი გადმოწერილი ჯუნიტი.
//        არჩევის მომენტში აირჩიე ორივე ORIVE და დაამატე თამარ კობახიძე 3 ის დონეზე. დააჭირე apply ის და მორჩა.
//


    }

}
