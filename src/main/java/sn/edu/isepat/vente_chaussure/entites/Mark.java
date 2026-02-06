
package sn.edu.isepat.vente_chaussure.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Mark{
    @Id
    private Integer id;


    private String nom;
    private String description;

}
