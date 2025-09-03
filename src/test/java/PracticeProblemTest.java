import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;

public class PracticeProblemTest {
@Test
@DisplayName("")
void swapTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {ArrayList.class, int.class, int.class};
        Method method = testClass.getDeclaredMethod("swap", cArg);
  // Enter code here
  ArrayList result = new ArrayList<String>(Arrays.asList("Help", "Me", "Fellow", "Young"));
  ArrayList a = new ArrayList<String>(Arrays.asList("Help", "Me", "Young", "Fellow"));
    method.invoke(null, a, 2, 3);
  assertEquals(result, a);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void swapTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {ArrayList.class, int.class, int.class};
        Method method = testClass.getDeclaredMethod("swap", cArg);
  // Enter code here
  ArrayList result = new ArrayList<String>(Arrays.asList("Me", "Help", "Young", "Fellow"));
  ArrayList a = new ArrayList<String>(Arrays.asList("Help", "Me", "Young", "Fellow"));
    method.invoke(null, a, 0, 1);
  assertEquals(result, a);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void swapTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {ArrayList.class, int.class, int.class};
        Method method = testClass.getDeclaredMethod("swap", cArg);
  // Enter code here
  ArrayList result = new ArrayList<String>(Arrays.asList("Help", "Me", "Young", "Fellow"));
  ArrayList a = new ArrayList<String>(Arrays.asList("Help", "Me", "Young", "Fellow"));
    method.invoke(null, a, 3, 3);
  assertEquals(result, a);
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void createArrayListTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { double[].class};
        Method method = testClass.getDeclaredMethod("createArrayList", cArg);
  // Enter code here
  ArrayList result = new ArrayList<Double>(Arrays.asList(0.2, 2.4, 4.6, 6.8));
    assertEquals(result, (ArrayList)method.invoke(null, new double[]{0.2, 2.4, 4.6, 6.8}));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void createArrayListTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { double[].class};
        Method method = testClass.getDeclaredMethod("createArrayList", cArg);
  // Enter code here
  ArrayList result = new ArrayList<Double>();
    assertEquals(result, (ArrayList)method.invoke(null, new double[]{}));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void createArrayListTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = { double[].class};
        Method method = testClass.getDeclaredMethod("createArrayList", cArg);
  // Enter code here
  ArrayList result = new ArrayList<Double>(Arrays.asList(1.3));
    assertEquals(result, (ArrayList)method.invoke(null, new double[]{1.3}));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void increaseAgeTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {HashMap.class, String.class};
        Method method = testClass.getDeclaredMethod("increaseAge", cArg);
  // Enter code here
  HashMap<String, Integer> result = new HashMap<String, Integer>();
  result.put("Jerry", 20);
    method.invoke(null, result, "Jerry");
  assertEquals(21, (int)result.get("Jerry"));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void increaseAgeTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {HashMap.class, String.class};
        Method method = testClass.getDeclaredMethod("increaseAge", cArg);
  // Enter code here
  HashMap<String, Integer> result = new HashMap<String, Integer>();
  result.put("Harry", 21);
  result.put("Fred", 99);
    method.invoke(null, result, "Fred");
  assertEquals(100, (int)(result.get("Fred")));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void combineParallelArraysTest1() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("combineParallelArrays", cArg);
  // Enter code here
  String[] arr = {"Jerry", "Anna" , "Perry"};
  int[] arr2 = {20, 19, 18};
  HashMap<String, Integer> result = new HashMap<String, Integer>();
  result.put("Jerry", 20);
  result.put("Anna", 19);
  result.put("Perry", 18);
    assertEquals(result, (HashMap)method.invoke(null, arr, arr2));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void combineParallelArraysTest2() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("combineParallelArrays", cArg);
  // Enter code here
  String[] arr = {};
  int[] arr2 = {};
  HashMap<String, Integer> result = new HashMap<String, Integer>();
    assertEquals(result, (HashMap)method.invoke(null, arr, arr2));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
@Test
@DisplayName("")
void combineParallelArraysTest3() {
    Class<?> testClass = PracticeProblem.class;
    try {
        Class[] cArg = {String[].class, int[].class};
        Method method = testClass.getDeclaredMethod("combineParallelArrays", cArg);
  // Enter code here
  String[] arr = {"Harry"};
  int[] arr2 = {155};
  HashMap<String, Integer> result = new HashMap<String, Integer>();
  result.put("Harry", 155);
    assertEquals(result, (HashMap)method.invoke(null, arr, arr2));
}


    catch (NoSuchMethodException e) {
        fail("Method does not exist");
}
    catch(Exception e) {
        fail("Something weird happened");
}
}
}
