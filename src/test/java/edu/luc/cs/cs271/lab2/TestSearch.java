package edu.luc.cs.cs271.lab2;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestSearch {
  
  Team[] makeArrayFixture(final int size) {
    final Team[] array = new Team[size];
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      array[i] = new Team("Team " + s, "Coach " + s, i * 100 + 50);
    }
    return array;
  }

  // makeListFixture
  List<Team> makeListFixture(final int size) {
    final List<Team> list = new ArrayList<Team>();
    for (int i = 0; i < size; i++) {
      final String s = Integer.toString(i);
      list.add(new Team("Team "+s, "Coach "+s, i*100+50));
    }
    return list;
  }
  @Test
  public void testFindPositionArray0() {
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10s() {
    final Team[] arr = makeArrayFixture(10);
    assertTrue(Search.findTeamPosition(arr, "Team 5").isPresent());
  }

  @Test
  public void testFindPositionArray10f() {
    final Team[] arr = makeArrayFixture(10);
    assertFalse(Search.findTeamPosition(arr, "Team 11").isPresent());
  }
  
  // testFindPositionList0, 10s, 10f
  @Test
  public void testFindPositionList0() {
    final List<Team> teams = makeListFixture(0);
    assertFalse(Search.findTeamPosition(teams, "Team 5").isPresent());
  }
  @Test
  public void testFindPositionList10s() {
    final List<Team> teams = makeListFixture(10);
    assertTrue(Search.findTeamPosition(teams, "Team 5").isPresent());
  }
  
  @Test
  public void testFindPosition10f() {
    final List<Team> teams = makeListFixture(10);
    assertFalse(Search.findTeamPosition(teams, "Team 11").isPresent());
  }
  // testFindMinFundingArray for several sizes and scenarios
  @Test
  public void testFindMinFundingArray0(){
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 600).isPresent());
  }
  
  @Test
  public void testFindMinFundingArray10s(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 500).isPresent());
  }
  
  // TODO testFindMinFundingArrayFast for several sizes and scenarios
  @Test
  public void testFindMinFundingArrayFast0(){
    final Team[] arr = makeArrayFixture(0);
    assertFalse(Search.findTeamMinFunding(arr, 600).isPresent());
  }
  
  @Test
  public void testFindMinFundingArrayFast10s(){
    final Team[] arr = makeArrayFixture(5);
    assertFalse(Search.findTeamMinFunding(arr, 500).isPresent());
  }
}
