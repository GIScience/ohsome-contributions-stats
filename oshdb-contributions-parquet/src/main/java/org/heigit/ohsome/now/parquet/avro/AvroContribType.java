/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package org.heigit.ohsome.now.parquet.avro;
@org.apache.avro.specific.AvroGenerated
public enum AvroContribType implements org.apache.avro.generic.GenericEnumSymbol<AvroContribType> {
  CREATED, DELETED, TAG, GEOMETRY, TAG_GEOMETRY, NONE  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"AvroContribType\",\"namespace\":\"org.heigit.ohsome.now.parquet.avro\",\"symbols\":[\"CREATED\",\"DELETED\",\"TAG\",\"GEOMETRY\",\"TAG_GEOMETRY\",\"NONE\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
