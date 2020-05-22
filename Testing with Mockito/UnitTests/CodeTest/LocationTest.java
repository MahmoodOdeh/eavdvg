package CodeTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import code.Location;
import code.LocationPoint;
import code.LocationService;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import code.Location;
import code.LocationPoint;
import code.LocationService; 

class LocationTest {

	@Test
	public void TestLocate()
	{
		LocationService location;
		location=mock(LocationService.class);
	
		Location locationUnderTest = new Location(location);
		when(location.geoLocate(new LocationPoint(-5, -5))).thenReturn(new LocationPoint(5, 5));
		
		LocationPoint expected = new LocationPoint(5, 5);
		
		
		
		assertEquals(expected.getX(), locationUnderTest.locate(-5, -5).getX());
		assertEquals(expected.getY(), locationUnderTest.locate(-5, -5).getY());
	}

	@Test
	public void printCalculationStatus()
	{
		LocationService location;
		location=mock(LocationService.class);
		LocationPoint expected= new LocationPoint(1,1);
		Location locationUnderTest = new Location(location);
		locationUnderTest.printCalculationStatus(expected);
			
		
	}
	@Test
	public void checkPrintCalculationStatusException()	
	{
		LocationService location;
		location=mock(LocationService.class);
		Location locationUnderTest = new Location(location);
		assertThrows(NullPointerException.class, ()-> locationUnderTest.printCalculationStatus(null)); 
	}
	
}
