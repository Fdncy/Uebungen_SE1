package org.hbrs.se1.ws25.tests.uebung2;

import org.hbrs.se1.ws25.exercises.uebung2.ConcreteMember;
import org.hbrs.se1.ws25.exercises.uebung2.Container;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContainerTest {
    Container container;
    ConcreteMember a;
    ConcreteMember b;

    @BeforeEach
    public void SetUp() {
        container = new Container();
        a = new ConcreteMember(1);
        b = new ConcreteMember(2);
    }

    @Test
    public void testContainer1() {
        assertEquals(0, container.size());
    }

    @Test
    public void testContainer2() {
        container.addMember(a);
        assertEquals(1, container.size());
    }

    @Test
    public void testContainer3() {
        container.addMember(a);
        container.addMember(b);
        assertEquals(2, container.size());
    }

    @Test
    public void testContainer4() {
        container.addMember(a);
        container.addMember(b);
        container.addMember(a);
        assertEquals(2, container.size());
    }

    @Test
    public void testContainer5() {
        container.addMember(a);
        container.addMember(b);
        container.deleteMember(a.getID());
        assertEquals(1, container.size());
    }

    @Test
    public void testContainer6() {
        container.addMember(a);
        container.addMember(b);
        container.deleteMember(999);
        assertEquals(2, container.size());
    }

    @Test
    public void testContainer7() {
        container.addMember(a);
        container.addMember(b);
        container.deleteMember(999);
        container.deleteMember(a.getID());
        assertEquals(1, container.size());
    }

    @Test
    public void testContainer8() {
        container.addMember(a);
        container.addMember(b);
        container.deleteMember(a.getID());
        container.deleteMember(b.getID());
        assertEquals(0, container.size());
    }

    @Test
    public void testContainer9() {
        container.addMember(a);
        container.addMember(b);
        container.deleteMember(a.getID());
        container.deleteMember(b.getID());
        container.deleteMember(999);
        assertEquals(0, container.size());
    }

    @Test
    public void testContainer10() {
        container.addMember(a);
        container.addMember(b);
        container.deleteMember(a.getID());
        container.deleteMember(b.getID());
        container.addMember(a);
        assertEquals(1, container.size());
    }
}
