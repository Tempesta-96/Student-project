//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.19 at 04:52:25 PM IST 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dob" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="address" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="line2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="line3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "firstname",
    "lastname",
    "gender",
    "dob",
    "address"
})
@XmlRootElement(name = "person")
public class Person {

    @XmlElement(required = true)
    protected String firstname;
    @XmlElement(required = true)
    protected String lastname;
    @XmlElement(required = true)
    protected String gender;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dob;
    @XmlElement(required = true)
    protected List<Person.Address> address;

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDob() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDob(XMLGregorianCalendar value) {
        this.dob = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Person.Address }
     * 
     * 
     */
    public List<Person.Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Person.Address>();
        }
        return this.address;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="line2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="line3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="zipcode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "line1",
        "line2",
        "line3",
        "state",
        "type",
        "zipcode"
    })
    public static class Address {

        @XmlElement(required = true)
        protected String line1;
        @XmlElement(required = true)
        protected String line2;
        @XmlElement(required = true)
        protected String line3;
        @XmlElement(required = true)
        protected String state;
        @XmlElement(required = true)
        protected String type;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger zipcode;

        /**
         * Gets the value of the line1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine1() {
            return line1;
        }

        /**
         * Sets the value of the line1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine1(String value) {
            this.line1 = value;
        }

        /**
         * Gets the value of the line2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine2() {
            return line2;
        }

        /**
         * Sets the value of the line2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine2(String value) {
            this.line2 = value;
        }

        /**
         * Gets the value of the line3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLine3() {
            return line3;
        }

        /**
         * Sets the value of the line3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLine3(String value) {
            this.line3 = value;
        }

        /**
         * Gets the value of the state property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getState() {
            return state;
        }

        /**
         * Sets the value of the state property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setState(String value) {
            this.state = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the zipcode property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getZipcode() {
            return zipcode;
        }

        /**
         * Sets the value of the zipcode property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setZipcode(BigInteger value) {
            this.zipcode = value;
        }

    }

}
