package legoset;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import movie.YearAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.Year;
import java.util.List;
import java.util.Set;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)

@XmlType(propOrder = {"name", "theme", "subtheme", "Year", "pieces", "tags", "minifigs", "weight", "url"})

@AllArgsConstructor

@NoArgsConstructor

@Data
public class LegoSet {

    @XmlAttribute
    private String number;

    private String name;

    private String theme;

    private String subtheme;

    @XmlJavaTypeAdapter(YearAdapter.class)
    private Year Year;

    private int pieces;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    private Weight weight;
    private String url;


}
