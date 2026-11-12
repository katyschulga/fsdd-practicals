package combinationlock;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Simon Powers
 * Unit tests for the CombinationLock class.
 */
public class TestCombinationLock {
	private CombinationLock lock00;       // lock with combination 00
	private CombinationLock lock01;       // lock with combination 01
	private CombinationLock lock12;       // lock with combination 12
	private CombinationLock lock99;       // lock with combination 99


	
	/**
	 * Create the four lock objects that will be used for testing.
	 * This method runs before every test, creating the lock 
	 * objects again.
	 */
	@Before
	public void setup(){
		lock00 = new CombinationLock(1000);
		lock01 = new CombinationLock(1);
		lock12 = new CombinationLock(-12);
		lock99 = new CombinationLock(99);
	}

	/*
	 * A private helper method used by some of the tests,
	 * which closes the four test lock objects.
	 * Note that we use normal comments rather than Javadoc
	 * comments for private methods, as private methods are not
	 * part of class' specification (i.e. other objects do not
	 * need to know about them, like with private variables).
	 */
	private void closeLocks(){
		lock00.close();
		lock01.close();
		lock12.close();
		lock99.close();
	}

	
	/**
	 * Test that issuing the close() command closes the lock.
	 */
	@Test
	public void testCloseLock(){
		lock00.close();
		assertFalse("Closed lock: lock 00", lock00.isOpen());
	}

	/**
	 * Test that entering the correct combination opens a lock.
	 */
	@Test
	public void testCorrectCombination () {
		closeLocks();

		lock00.enter(0); lock00.enter(0);
		assertTrue("Correct comb: lock 00",lock00.isOpen());

		lock01.enter(0); lock01.enter(1);
		assertTrue("Correct comb: lock 01",lock01.isOpen());

		lock12.enter(1); lock12.enter(2);
		assertTrue("Correct comb: lock 12",lock12.isOpen());

		lock99.enter(9); lock99.enter(9);
		assertTrue("Correct comb: lock 99",lock01.isOpen());
	}

	/**
	 * Test that entering an incorrect combination doesn't open a lock.
	 */
	@Test
	public void testIncorrectCombination () {
		closeLocks();

		lock00.enter(1); lock00.enter(0);
		assertFalse("Incorrect comb: lock 00", lock00.isOpen());

		lock01.enter(1); lock01.enter(1);
		assertFalse("Incorrect comb: lock 01", lock01.isOpen());

		lock12.enter(2); lock12.enter(1);
		assertFalse("Incorrect comb: lock 12", lock12.isOpen());

		lock99.enter(0); lock99.enter(9);
		assertFalse("Incorrect comb: lock 99", lock99.isOpen());

	}

	/**
	 * Test that entering the first combination digit twice leaves the lock almost open
	 * (unless two combination digits are the same).
	 */
	@Test
	public void testFirstDigitTwice () {
		closeLocks();

		lock01.enter(0); lock01.enter(0);
		assertFalse("1st, 1st: lock 01",lock01.isOpen());
		lock01.enter(1);
		assertTrue("1st, 1st, 2nd: lock 01", lock01.isOpen());

		lock12.enter(1); lock12.enter(1);
		assertFalse("1st, 1st: lock 12", lock12.isOpen());
		lock12.enter(2);
		assertTrue("1st, 1st, 2nd: lock 12", lock12.isOpen());
	}

	/**
	 * Test that entering the first combination digit followed by an incorrect digit
	 * different from the first leaves the lock reset.
	 */
	@Test
	public void testCorrectFirstDigit () {
		closeLocks();

		lock01.enter(0); lock01.enter(2); lock01.enter(1);
		assertFalse("1st, X, 2nd: lock 01", lock01.isOpen());

		lock12.enter(1); lock12.enter(0); lock12.enter(2);
		assertFalse("1st, X, 2nd: lock 12", lock12.isOpen());

		lock99.enter(9); lock99.enter(0); lock99.enter(9);
		assertFalse("1st, X, 2nd: lock 99", lock99.isOpen());
	}

	/**
	 * Test closing a closed lock resets the lock.
	 */
	@Test
	public void testCloseAlmostOpenLock () {
		closeLocks();

		lock00.enter(0);
		lock00.close();
		lock00.enter(0);
		assertFalse("reset almost open: lock 00", lock00.isOpen());

		lock12.enter(1);
		lock12.close();
		lock12.enter(2);
		assertFalse("reset almost open: lock 12", lock12.isOpen());

		lock01.enter(0);
		lock01.close();
		lock01.enter(1);
		assertFalse("reset almost open: lock 01", lock01.isOpen());

		lock99.enter(9);
		lock99.close();
		lock99.enter(9);
		assertFalse("reset almost open: lock 99", lock99.isOpen());
	}


	/**
	 * Test closing a closed lock leaves the lock closed.
	 */
	@Test
	public void testCloseResetLock () {
		closeLocks();
		lock12.close();
		assertFalse("close reset: lock 12",lock12.isOpen());
	}
	
	/**
	 * Test that entering an incorrect combination does not close an open lock.
	 */
	@Test
	public void testOpenLock(){
		lock12.enter(3);
		lock12.enter(4);
		assertTrue("Open lock: lock 12", lock12.isOpen());
	}


}
