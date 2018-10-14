package se.ju.csi.oom.lab4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DateTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testToString() {
		
		DateTime _date;
		
		_date = new DateTime(2017,12,31,10,0,0);
		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, 26);
		DateTime _expected7 = new DateTime(2018,1,1,12,0,0); // days +1, month -12, year +1
		assertEquals(_expected7.toString(), _date.toString());
		
		
//		 Ex from doc...
		_date = new DateTime(2016,1,1,6,0,0);
		int UsPacificCoastTime = -9;
		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, UsPacificCoastTime);
		
		DateTime _expected9 = new DateTime(2015,12,31,21,0,0);
		assertEquals(_expected9.toString(), _date.toString());
		
		
		DateTime temp = new DateTime(_expected9.toString());
		
		assertEquals(_expected9.toString(), temp.toString());
		
		//fail("Not yet implemented");
	}

	@Test
	public void testDateTimeString() {
		
		DateTime _date;
		
		_date = new DateTime(2017,12,31,10,0,0);
		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, 26);
		DateTime _expected7 = new DateTime(2018,1,1,12,0,0); // days +1, month -12, year +1
		assertEquals(_expected7.toString(), _date.toString());
		
		
//		 Ex from doc...
		_date = new DateTime(2016,1,1,6,0,0);
		int UsPacificCoastTime = -9;
		_date = TimeZoneTranslator.shiftTimeZone(_date, 0, UsPacificCoastTime);
		
		DateTime _expected9 = new DateTime(2015,12,31,21,0,0);
		assertEquals(_expected9.toString(), _date.toString());
		
		
		DateTime temp = new DateTime(_expected9.toString());
		
		assertEquals(_expected9.toString(), temp.toString());
		
		//fail("Not yet implemented");
	}

}
