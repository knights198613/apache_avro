/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.jiangwei.avrotest.beans;

import org.apache.avro.specific.SpecificData;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 6210769098865930196L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"com.jiangwei.avrotest.beans\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"userName\",\"type\":\"string\"},{\"name\":\"favoriteNumber\",\"type\":[\"int\",\"null\"]},{\"name\":\"favoriteColor\",\"type\":[\"string\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public int id;
  @Deprecated public java.lang.CharSequence userName;
  @Deprecated public java.lang.Integer favoriteNumber;
  @Deprecated public java.lang.CharSequence favoriteColor;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public User() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param userName The new value for userName
   * @param favoriteNumber The new value for favoriteNumber
   * @param favoriteColor The new value for favoriteColor
   */
  public User(java.lang.Integer id, java.lang.CharSequence userName, java.lang.Integer favoriteNumber, java.lang.CharSequence favoriteColor) {
    this.id = id;
    this.userName = userName;
    this.favoriteNumber = favoriteNumber;
    this.favoriteColor = favoriteColor;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return userName;
    case 2: return favoriteNumber;
    case 3: return favoriteColor;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: userName = (java.lang.CharSequence)value$; break;
    case 2: favoriteNumber = (java.lang.Integer)value$; break;
    case 3: favoriteColor = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.Integer value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'userName' field.
   * @return The value of the 'userName' field.
   */
  public java.lang.CharSequence getUserName() {
    return userName;
  }

  /**
   * Sets the value of the 'userName' field.
   * @param value the value to set.
   */
  public void setUserName(java.lang.CharSequence value) {
    this.userName = value;
  }

  /**
   * Gets the value of the 'favoriteNumber' field.
   * @return The value of the 'favoriteNumber' field.
   */
  public java.lang.Integer getFavoriteNumber() {
    return favoriteNumber;
  }

  /**
   * Sets the value of the 'favoriteNumber' field.
   * @param value the value to set.
   */
  public void setFavoriteNumber(java.lang.Integer value) {
    this.favoriteNumber = value;
  }

  /**
   * Gets the value of the 'favoriteColor' field.
   * @return The value of the 'favoriteColor' field.
   */
  public java.lang.CharSequence getFavoriteColor() {
    return favoriteColor;
  }

  /**
   * Sets the value of the 'favoriteColor' field.
   * @param value the value to set.
   */
  public void setFavoriteColor(java.lang.CharSequence value) {
    this.favoriteColor = value;
  }

  /**
   * Creates a new User RecordBuilder.
   * @return A new User RecordBuilder
   */
  public static com.jiangwei.avrotest.beans.User.Builder newBuilder() {
    return new com.jiangwei.avrotest.beans.User.Builder();
  }

  /**
   * Creates a new User RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new User RecordBuilder
   */
  public static com.jiangwei.avrotest.beans.User.Builder newBuilder(com.jiangwei.avrotest.beans.User.Builder other) {
    return new com.jiangwei.avrotest.beans.User.Builder(other);
  }

  /**
   * Creates a new User RecordBuilder by copying an existing User instance.
   * @param other The existing instance to copy.
   * @return A new User RecordBuilder
   */
  public static com.jiangwei.avrotest.beans.User.Builder newBuilder(com.jiangwei.avrotest.beans.User other) {
    return new com.jiangwei.avrotest.beans.User.Builder(other);
  }

  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private int id;
    private java.lang.CharSequence userName;
    private java.lang.Integer favoriteNumber;
    private java.lang.CharSequence favoriteColor;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.jiangwei.avrotest.beans.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userName)) {
        this.userName = data().deepCopy(fields()[1].schema(), other.userName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.favoriteNumber)) {
        this.favoriteNumber = data().deepCopy(fields()[2].schema(), other.favoriteNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.favoriteColor)) {
        this.favoriteColor = data().deepCopy(fields()[3].schema(), other.favoriteColor);
        fieldSetFlags()[3] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing User instance
     * @param other The existing instance to copy.
     */
    private Builder(com.jiangwei.avrotest.beans.User other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userName)) {
        this.userName = data().deepCopy(fields()[1].schema(), other.userName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.favoriteNumber)) {
        this.favoriteNumber = data().deepCopy(fields()[2].schema(), other.favoriteNumber);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.favoriteColor)) {
        this.favoriteColor = data().deepCopy(fields()[3].schema(), other.favoriteColor);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.Integer getId() {
      return id;
    }

    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userName' field.
      * @return The value.
      */
    public java.lang.CharSequence getUserName() {
      return userName;
    }

    /**
      * Sets the value of the 'userName' field.
      * @param value The value of 'userName'.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder setUserName(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.userName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userName' field has been set.
      * @return True if the 'userName' field has been set, false otherwise.
      */
    public boolean hasUserName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userName' field.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder clearUserName() {
      userName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'favoriteNumber' field.
      * @return The value.
      */
    public java.lang.Integer getFavoriteNumber() {
      return favoriteNumber;
    }

    /**
      * Sets the value of the 'favoriteNumber' field.
      * @param value The value of 'favoriteNumber'.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder setFavoriteNumber(java.lang.Integer value) {
      validate(fields()[2], value);
      this.favoriteNumber = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'favoriteNumber' field has been set.
      * @return True if the 'favoriteNumber' field has been set, false otherwise.
      */
    public boolean hasFavoriteNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'favoriteNumber' field.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder clearFavoriteNumber() {
      favoriteNumber = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'favoriteColor' field.
      * @return The value.
      */
    public java.lang.CharSequence getFavoriteColor() {
      return favoriteColor;
    }

    /**
      * Sets the value of the 'favoriteColor' field.
      * @param value The value of 'favoriteColor'.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder setFavoriteColor(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.favoriteColor = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'favoriteColor' field has been set.
      * @return True if the 'favoriteColor' field has been set, false otherwise.
      */
    public boolean hasFavoriteColor() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'favoriteColor' field.
      * @return This builder.
      */
    public com.jiangwei.avrotest.beans.User.Builder clearFavoriteColor() {
      favoriteColor = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.userName = fieldSetFlags()[1] ? this.userName : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.favoriteNumber = fieldSetFlags()[2] ? this.favoriteNumber : (java.lang.Integer) defaultValue(fields()[2]);
        record.favoriteColor = fieldSetFlags()[3] ? this.favoriteColor : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  private static final org.apache.avro.io.DatumWriter
    WRITER$ = new org.apache.avro.specific.SpecificDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  private static final org.apache.avro.io.DatumReader
    READER$ = new org.apache.avro.specific.SpecificDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}