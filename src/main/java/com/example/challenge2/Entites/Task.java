package com.example.challenge2.Entites;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@Document(collection = "Tasks")
public class Task {
    @Id
    private String _id;
    private String name ;
    private String Description;


    public static void setId(String idTask) {

    }
}
