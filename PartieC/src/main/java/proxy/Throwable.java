
package proxy;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for throwable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType name="throwable">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="stackTrace" type="{http://ReleveWS/}stackTraceElement" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "throwable", propOrder = {
    "stackTrace"
})
public class Throwable {

    @XmlElement(nillable = true)
    protected List<StackTraceElement> stackTrace;

    /**
     * Gets the value of the stackTrace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stackTrace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStackTrace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StackTraceElement }
     * 
     * 
     * @return
     *     The value of the stackTrace property.
     */
    public List<StackTraceElement> getStackTrace() {
        if (stackTrace == null) {
            stackTrace = new ArrayList<>();
        }
        return this.stackTrace;
    }

}
