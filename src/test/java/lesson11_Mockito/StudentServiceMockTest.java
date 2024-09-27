package lesson11_Mockito;

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.Test;
class StudentServiceMockTest {

    @Test
    void testFindTotal() {
        StudentDao studentDaoMock = Mockito.mock(StudentDao.class);
        Mockito.when(studentDaoMock.getMarks()).thenReturn(new int[] {15, 20, 5});

        StudentService studentService = new StudentService(studentDaoMock);
        int total = studentService.findTotal();
        Assertions.assertEquals(40, total);
    }

    @Test
    void testFindTotal_EmptyArray() {
        StudentDao studentDaoMock = Mockito.mock(StudentDao.class);
        Mockito.when(studentDaoMock.getMarks()).thenReturn(new int[] {});

        StudentService studentService = new StudentService(studentDaoMock);
        int total = studentService.findTotal();
        Assertions.assertEquals(0, total);
    }
}