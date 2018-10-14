package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TimeZoneTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testShiftTimeZone() {
		
		DateTime _date;
		
//		_date = new DateTime(2018,10,11,10,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, 2);
//		DateTime _expected = new DateTime(2018,10,11,12,0,0);
//		assertEquals(_expected.toString(), _date.toString());
//		
//		_date = new DateTime(2018,10,11,10,0,0);		//Bug 1: bytt - => + (rad 11)
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 1, 2);
//		DateTime _expected1 = new DateTime(2018,10,11,13,0,0);
//		assertEquals(_expected1.toString(), _date.toString());
//		
//		_date = new DateTime(2018,10,11,10,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 1, -2);
//		DateTime _expected2 = new DateTime(2018,10,11,9,0,0);
//		assertEquals(_expected2.toString(), _date.toString());
//		
//		_date = new DateTime(2018,10,11,10,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, 26); // hours 24-> days +1
//		DateTime _expected3 = new DateTime(2018,10,12,12,0,0);
//		assertEquals(_expected3.toString(), _date.toString());
//		
//		_date = new DateTime(2018,10,11,10,0,0); 
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, -26);// hours <-24 days -1  
//		DateTime _expected4 = new DateTime(2018,10,10,8,0,0);
//		assertEquals(_expected4.toString(), _date.toString());
		
//		_date = new DateTime(2018,10,31,20,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, 32);
//		DateTime _expected5 = new DateTime(2018,11,2,4,0,0); // days +2, month +1
//		assertEquals(_expected5.toString(), _date.toString());
		
//		_date = new DateTime(2018,10,1,4,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, -8);
//		DateTime _expected6 = new DateTime(2018,9,31,20,0,0); // days -1, month -1
//		assertEquals(_expected6.toString(), _date.toString());

//		_date = new DateTime(2017,12,31,10,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, 26);
//		DateTime _expected7 = new DateTime(2018,1,1,12,0,0); // days +1, month -12, year +1
//		assertEquals(_expected7.toString(), _date.toString());
		
//		_date = new DateTime(2018,1,1,4,0,0);
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, -8);
//		DateTime _expected8 = new DateTime(2017,12,31,20,0,0); // days -1, month +12, year -1
//		assertEquals(_expected8.toString(), _date.toString());
		
		// Ex from doc...
//		_date = new DateTime(2016,1,1,6,0,0);
//		int UsPacificCoastTime = -9;
//		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, UsPacificCoastTime);
//		DateTime _expected9 = new DateTime(2015,12,31,21,0,0);
//		assertEquals(_expected9.toString(), _date.toString());
		
		//fail("Not yet implemented");
	}

	@Test
	public void testShiftEventTimeZone() {
		
		String label = "test";
		DateTime _start;
		DateTime _end;
		DateTime _exStart;
		DateTime _exEnd;
		Event _event;
		
//		_start = new DateTime(2018,10,11,0,0,0);
//		_end = new DateTime(2018,11,12,0,0,0);
//		Place HC218 = new Place("Hc218",57.7785672,14.1614833,20.0);
//		Event _event = new Event(label,_start,_end,null,HC218);
//		_event = TimeZoneTranslator.shiftEventTimeZone(_event, TimeZone.GREENWICH_UTC, TimeZone.MOSCOW);
//		
//		DateTime _exStart = new DateTime(2018,10,11,3,0,0);  			//  fromOffset 0 -> toOffset 3
//		DateTime _exEnd = new DateTime(2018,11,12,3,0,0);
//		Event _expected = new Event(label,_exStart,_exEnd,null,HC218);
//		assertEquals(_expected.toString(), _event.toString());
		
		
//		_start = new DateTime(2018,10,11,0,0,0);
//		_end = new DateTime(2018,10,12,0,0,0);
//		Place HC2181 = new Place("Hc218",57.7785672,14.1614833,20.0);
//		Event _event1 = new Event(label,_start,_end,null,HC2181);
//		_event = TimeZoneTranslator.shiftEventTimeZone(_event1, TimeZone.CENTRAL_EUROPEAN_TIME, TimeZone.MOSCOW);
//		
//		_exStart = new DateTime(2018,10,11,4,0,0);						//  fromOffset 1 -> toOffset 3
//		_exEnd = new DateTime(2018,10,12,4,0,0);
//		Event _expected1 = new Event(label,_exStart,_exEnd,null,HC2181);
//		assertEquals(_expected1.toString(), _event.toString());
		
		
//		_start = new DateTime(2018,10,11,0,0,0);
//		_end = new DateTime(2018,10,12,0,0,0);
//		Place HC2181 = new Place("Hc218",57.7785672,14.1614833,20.0);
//		Event _event1 = new Event(label,_start,_end,null,HC2181);
//		_event = TimeZoneTranslator.shiftEventTimeZone(_event1, TimeZone.CENTRAL_EUROPEAN_TIME, TimeZone.US_EASTERN);
//		
//		_exStart = new DateTime(2018,10,10,20,0,0);				// usual fromOffset 1 -> toOffset -5
//		_exEnd = new DateTime(2018,10,11,20,0,0);
//		Event _expected1 = new Event(label,_exStart,_exEnd,null,HC2181);
//		assertEquals(_expected1.toString(), _event.toString());
		
		
		_start = new DateTime(2018,1,1,2,0,0);
		_end = new DateTime(2018,1,2,2,0,0);
		Place HC2181 = new Place("Hc218",57.7785672,14.1614833,20.0);
		Event _event1 = new Event(label,_start,_end,null,HC2181);
		_event = TimeZoneTranslator.shiftEventTimeZone(_event1, TimeZone.CENTRAL_EUROPEAN_TIME, TimeZone.US_EASTERN);
		
		_exStart = new DateTime(2017,12,31,22,0,0);				// usual fromOffset 1 -> toOffset -5
		_exEnd = new DateTime(2018,1,1,22,0,0);				// year -1, month +12, days -1
		Event _expected1 = new Event(label,_exStart,_exEnd,null,HC2181);
		assertEquals(_expected1.toString(), _event.toString());
		
		
		
		// tjena
		

		//fail("Not yet implemented");
	}
}
