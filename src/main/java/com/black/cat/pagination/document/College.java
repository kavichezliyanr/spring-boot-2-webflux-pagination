/**
 * 
 */
package com.black.cat.pagination.document;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author Kavichezliyan
 *
 */
@Document(collection = "college")
@Data
public class College implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3688116551371277490L;
	
	@Id
	private String id;

	@TextIndexed
	private String collegeName;
	
	private String district;

}
