package com.springboot.config;

import java.util.List;

public class PatientController { // Changed class name to be more descriptive

    public ResponseData<List<PatientResponseDTO>> getPatients() {
        //Simulate Logic
        List<PatientResponseDTO> patients = List.of(new PatientResponseDTO("wedfvc","werg","er","qwee"),
                new PatientResponseDTO("qwer","sdfghj","sghj","qwetgh"));

        // Wrap the list in a ApiResponse
        ApiResponse<List<PatientResponseDTO>> response = ApiResponse.success(patients);
        return response;
    }

    public static void main(String[] args) {
        PatientController controller = new PatientController();
        ResponseData<List<PatientResponseDTO>> response = controller.getPatients();

        // Print the response details.  You'd typically return this via a web framework.
        if (response instanceof ApiResponse) {
            ApiResponse<List<PatientResponseDTO>> apiResponse = (ApiResponse<List<PatientResponseDTO>>) response; //need to cast
            System.out.println("Status: " + apiResponse.getStatus());
            System.out.println("Message: " + apiResponse.getMessage());
            System.out.println("Data: " + apiResponse.getData().get(0).getId());
        }
        else{
            System.out.println("Error: Response is not an instance of ApiResponse");
        }
    }
}