package main.model.observe.implementation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by joaok on 27/04/2017.
 */
public class ImplementationSubjectTest {

    ImplementationSubject subject;
    ImplementationObserver observer0;

    @Before
    public void setUp() throws Exception {
        subject = new ImplementationSubject(0);
    }

    @After
    public void tearDown() throws Exception {
        subject = null;
        observer0 = null;
    }

    @Test
    public void registerObserverDirectly() throws Exception {
        observer0 = new ImplementationObserver("Jeff");
        subject.registerObserver(observer0);
        assertEquals(true, subject.checkObserver(observer0));
    }

    @Test
    public void removeObserverDirectly() throws Exception {
        observer0 = new ImplementationObserver("Jeff");
        assertEquals(0, subject.registerObserver(observer0));
        assertEquals(true, subject.checkObserver(observer0));
        assertEquals(0, subject.removeObserver(observer0));
        assertEquals(false, subject.checkObserver(observer0));
    }

    @Test
    public void registerObserverConstructor() throws Exception {
        observer0 = new ImplementationObserver(subject, "Jeff");
        assertEquals(true, subject.checkObserver(observer0));
    }

    @Test
    public void removeObserverConstructor() throws Exception {
        observer0 = new ImplementationObserver(subject, "Jeff");
        assertEquals(true, subject.checkObserver(observer0));
        assertEquals(0, subject.removeObserver(observer0));
        assertEquals(false, subject.checkObserver(observer0));
    }

    @Test
    public void removeObserver() throws Exception {
        observer0 = new ImplementationObserver(subject, "Gerald");
        assertEquals(0, subject.removeObserver(observer0));
        assertEquals(false, subject.checkObserver(observer0));
    }

    @Test
    public void notifyObservers() throws Exception {
    }

    @Test
    public void setState() throws Exception {
    }

    @Test
    public void getState() throws Exception {
    }

}