//package com.anny.SpringFirstApi2.service;
//
//import com.anny.SpringFirstApi2.entity.Department;
//import com.anny.SpringFirstApi2.repository.DepartmentRepository;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DepartmentServiceImplTest {
//    @Autowired private DepartmentService departmentService;
//    @MockBean
//    private DepartmentRepository departmentRepository;
//    @BeforeEach
//    void setUp() {
//Department department =
//        Department.builder()
//                .departmentName("IT")
//                .departmentCode("IT -05")
//                .departmentAddress("Wincosin")
//                .departmentId(2L)
//                .build();
//        Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT"))
//                .thenReturn(department);
//    }
//    @Test
//    public void whenValidDepartmentName_thenDepartmentShouldFound(){
//        String departmentName = "IT";
//        Department found = departmentService.getDepartmentByName(departmentName);
//        assertEquals(departmentName,found.getDepartmentName());
//    }
//}