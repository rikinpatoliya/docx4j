
package org.docx4j.dml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ST_TextCapsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ST_TextCapsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="small"/>
 *     &lt;enumeration value="all"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ST_TextCapsType")
@XmlEnum
public enum STTextCapsType {


    /**
     * Text Caps Enum ( None )
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * Text Caps Enum ( Small )
     * 
     */
    @XmlEnumValue("small")
    SMALL("small"),

    /**
     * Text Caps Enum ( All )
     * 
     */
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    STTextCapsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static STTextCapsType fromValue(String v) {
        for (STTextCapsType c: STTextCapsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
