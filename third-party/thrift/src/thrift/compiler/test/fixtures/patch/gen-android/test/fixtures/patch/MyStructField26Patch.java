/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStructField26Patch implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructField26Patch");
  private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.LIST, (short)1);
  private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
  private static final TField PATCH_FIELD_DESC = new TField("patch", TType.MAP, (short)3);
  private static final TField PREPEND_FIELD_DESC = new TField("prepend", TType.LIST, (short)8);
  private static final TField APPEND_FIELD_DESC = new TField("append", TType.LIST, (short)9);

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   */
  public final List<Short> assign;
  /**
   * Clears a value. Applies first.
   */
  public final Boolean clear;
  /**
   * Patches list values by index. Applies second.
   */
  public final Map<Integer,I16Patch> patch;
  /**
   * Prepends to the front of a given list.
   */
  public final List<Short> prepend;
  /**
   * Appends to the back of a given list.
   */
  public final List<Short> append;
  public static final int ASSIGN = 1;
  public static final int CLEAR = 2;
  public static final int PATCH = 3;
  public static final int PREPEND = 8;
  public static final int APPEND = 9;

  public MyStructField26Patch(
      List<Short> assign,
      Boolean clear,
      Map<Integer,I16Patch> patch,
      List<Short> prepend,
      List<Short> append) {
    this.assign = assign;
    this.clear = clear;
    this.patch = patch;
    this.prepend = prepend;
    this.append = append;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructField26Patch(MyStructField26Patch other) {
    if (other.isSetAssign()) {
      this.assign = TBaseHelper.deepCopy(other.assign);
    } else {
      this.assign = null;
    }
    if (other.isSetClear()) {
      this.clear = TBaseHelper.deepCopy(other.clear);
    } else {
      this.clear = null;
    }
    if (other.isSetPatch()) {
      this.patch = TBaseHelper.deepCopy(other.patch);
    } else {
      this.patch = null;
    }
    if (other.isSetPrepend()) {
      this.prepend = TBaseHelper.deepCopy(other.prepend);
    } else {
      this.prepend = null;
    }
    if (other.isSetAppend()) {
      this.append = TBaseHelper.deepCopy(other.append);
    } else {
      this.append = null;
    }
  }

  public MyStructField26Patch deepCopy() {
    return new MyStructField26Patch(this);
  }

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   */
  public List<Short> getAssign() {
    return this.assign;
  }

  // Returns true if field assign is set (has been assigned a value) and false otherwise
  public boolean isSetAssign() {
    return this.assign != null;
  }

  /**
   * Clears a value. Applies first.
   */
  public Boolean isClear() {
    return this.clear;
  }

  // Returns true if field clear is set (has been assigned a value) and false otherwise
  public boolean isSetClear() {
    return this.clear != null;
  }

  /**
   * Patches list values by index. Applies second.
   */
  public Map<Integer,I16Patch> getPatch() {
    return this.patch;
  }

  // Returns true if field patch is set (has been assigned a value) and false otherwise
  public boolean isSetPatch() {
    return this.patch != null;
  }

  /**
   * Prepends to the front of a given list.
   */
  public List<Short> getPrepend() {
    return this.prepend;
  }

  // Returns true if field prepend is set (has been assigned a value) and false otherwise
  public boolean isSetPrepend() {
    return this.prepend != null;
  }

  /**
   * Appends to the back of a given list.
   */
  public List<Short> getAppend() {
    return this.append;
  }

  // Returns true if field append is set (has been assigned a value) and false otherwise
  public boolean isSetAppend() {
    return this.append != null;
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructField26Patch))
      return false;
    MyStructField26Patch that = (MyStructField26Patch)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAssign(), that.isSetAssign(), this.assign, that.assign)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetClear(), that.isSetClear(), this.clear, that.clear)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPatch(), that.isSetPatch(), this.patch, that.patch)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetPrepend(), that.isSetPrepend(), this.prepend, that.prepend)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetAppend(), that.isSetAppend(), this.append, that.append)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {assign, clear, patch, prepend, append});
  }

  // This is required to satisfy the TBase interface, but can't be implemented on immutable struture.
  public void read(TProtocol iprot) throws TException {
    throw new TException("unimplemented in android immutable structure");
  }

  public static MyStructField26Patch deserialize(TProtocol iprot) throws TException {
    List<Short> tmp_assign = null;
    Boolean tmp_clear = null;
    Map<Integer,I16Patch> tmp_patch = null;
    List<Short> tmp_prepend = null;
    List<Short> tmp_append = null;
    TField __field;
    iprot.readStructBegin();
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case ASSIGN:
          if (__field.type == TType.LIST) {
            {
              TList _list49 = iprot.readListBegin();
              tmp_assign = new ArrayList<Short>(Math.max(0, _list49.size));
              for (int _i50 = 0; 
                   (_list49.size < 0) ? iprot.peekList() : (_i50 < _list49.size); 
                   ++_i50)
              {
                Short _elem51;
                _elem51 = iprot.readI16();
                tmp_assign.add(_elem51);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CLEAR:
          if (__field.type == TType.BOOL) {
            tmp_clear = iprot.readBool();
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PATCH:
          if (__field.type == TType.MAP) {
            {
              TMap _map52 = iprot.readMapBegin();
              tmp_patch = new HashMap<Integer,I16Patch>(Math.max(0, 2*_map52.size));
              for (int _i53 = 0; 
                   (_map52.size < 0) ? iprot.peekMap() : (_i53 < _map52.size); 
                   ++_i53)
              {
                Integer _key54;
                I16Patch _val55;
                _key54 = iprot.readI32();
                _val55 = I16Patch.deserialize(iprot);
                tmp_patch.put(_key54, _val55);
              }
              iprot.readMapEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case PREPEND:
          if (__field.type == TType.LIST) {
            {
              TList _list56 = iprot.readListBegin();
              tmp_prepend = new ArrayList<Short>(Math.max(0, _list56.size));
              for (int _i57 = 0; 
                   (_list56.size < 0) ? iprot.peekList() : (_i57 < _list56.size); 
                   ++_i57)
              {
                Short _elem58;
                _elem58 = iprot.readI16();
                tmp_prepend.add(_elem58);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case APPEND:
          if (__field.type == TType.LIST) {
            {
              TList _list59 = iprot.readListBegin();
              tmp_append = new ArrayList<Short>(Math.max(0, _list59.size));
              for (int _i60 = 0; 
                   (_list59.size < 0) ? iprot.peekList() : (_i60 < _list59.size); 
                   ++_i60)
              {
                Short _elem61;
                _elem61 = iprot.readI16();
                tmp_append.add(_elem61);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    MyStructField26Patch _that;
    _that = new MyStructField26Patch(
      tmp_assign
      ,tmp_clear
      ,tmp_patch
      ,tmp_prepend
      ,tmp_append
    );
    _that.validate();
    return _that;
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.assign != null) {
      if (isSetAssign()) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I16, this.assign.size()));
          for (Short _iter62 : this.assign)          {
            oprot.writeI16(_iter62);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.clear != null) {
      oprot.writeFieldBegin(CLEAR_FIELD_DESC);
      oprot.writeBool(this.clear);
      oprot.writeFieldEnd();
    }
    if (this.patch != null) {
      oprot.writeFieldBegin(PATCH_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.I32, TType.STRUCT, this.patch.size()));
        for (Map.Entry<Integer, I16Patch> _iter63 : this.patch.entrySet())        {
          oprot.writeI32(_iter63.getKey());
          _iter63.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.prepend != null) {
      oprot.writeFieldBegin(PREPEND_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I16, this.prepend.size()));
        for (Short _iter64 : this.prepend)        {
          oprot.writeI16(_iter64);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.append != null) {
      oprot.writeFieldBegin(APPEND_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I16, this.append.size()));
        for (Short _iter65 : this.append)        {
          oprot.writeI16(_iter65);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    return TBaseHelper.toStringHelper(this, indent, prettyPrint);
  }

  public void validate() throws TException {
    // check for required fields
  }

}

