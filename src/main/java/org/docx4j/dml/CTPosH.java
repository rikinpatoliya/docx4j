
package org.docx4j.dml;

import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.ppp.Child;


/**
 * <p>Java class for CT_PosH complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_PosH">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="align" type="{http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing}ST_AlignH"/>
 *           &lt;element name="offset" type="{http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing}ST_PositionOffsetBeta1"/>
 *           &lt;element name="posOffset" type="{http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing}ST_PositionOffset"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="relativeFrom" use="required" type="{http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing}ST_RelFromH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_PosH", namespace = "http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", propOrder = {
    "align",
    "offset",
    "posOffset"
})
public class CTPosH
    implements Child
{

    protected STAlignH align;
    protected Long offset;
    protected Integer posOffset;
    @XmlAttribute(required = true)
    protected STRelFromH relativeFrom;
    @XmlTransient
    private Object parent;

    /**
     * Gets the value of the align property.
     * 
     * @return
     *     possible object is
     *     {@link STAlignH }
     *     
     */
    public STAlignH getAlign() {
        return align;
    }

    /**
     * Sets the value of the align property.
     * 
     * @param value
     *     allowed object is
     *     {@link STAlignH }
     *     
     */
    public void setAlign(STAlignH value) {
        this.align = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
    }

    /**
     * Gets the value of the posOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPosOffset() {
        return posOffset;
    }

    /**
     * Sets the value of the posOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPosOffset(Integer value) {
        this.posOffset = value;
    }

    /**
     * Gets the value of the relativeFrom property.
     * 
     * @return
     *     possible object is
     *     {@link STRelFromH }
     *     
     */
    public STRelFromH getRelativeFrom() {
        return relativeFrom;
    }

    /**
     * Sets the value of the relativeFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link STRelFromH }
     *     
     */
    public void setRelativeFrom(STRelFromH value) {
        this.relativeFrom = value;
    }

    /**
     * Gets the parent object in the object tree representing the unmarshalled xml document.
     * 
     * @return
     *     The parent object.
     */
    public Object getParent() {
        return this.parent;
    }

    public void setParent(Object parent) {
        this.parent = parent;
    }

    /**
     * This method is invoked by the JAXB implementation on each instance when unmarshalling completes.
     * 
     * @param parent
     *     The parent object in the object tree.
     * @param unmarshaller
     *     The unmarshaller that generated the instance.
     */
    public void afterUnmarshal(Unmarshaller unmarshaller, Object parent) {
        setParent(parent);
    }

}
