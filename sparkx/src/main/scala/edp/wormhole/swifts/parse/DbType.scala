/*-
 * <<
 * wormhole
 * ==
 * Copyright (C) 2016 - 2017 EDP
 * ==
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * >>
 */


package edp.wormhole.swifts.parse

object DbType {
  def convert(dataTytpe: String): String = dataTytpe match {
      //mysql type
    case "TIMESTAMP" => "datetime"
    case "DATE" => "date"
    case "DATETIME" => "datetime"
    case "DECIMAL" => "decimal"
    case "SMALLINT" => "int"
    case "INT" => "int"
    case "BIGINT" => "long"
    case "FLOAT" => "float"
    case "DOUBLE" => "double"
    case "VARCHAR" => "string"
    case "TEXT" => "string"
    case "LONGTEXT" => "string"
    case "BLOB" => "binary"
    case "LONGBLOB" => "binary"
    case "BINARY" => "binary"

    //oracle
    case "VARCHAR2" => "string"
    case "INTEGER" => "int"
    case "CLOB" => "string"
    case "RAW" => "binary"
    case "NUMBER" => "decimal"
    case "LONG RAW" => "binary"

//    case "oracle.sql.TIMESTAMP" => "datetime"
//    case "java.math.BigDecimal" => "decimal"
//    case "java.sql.Timestamp" => "datetime"
//    case "java.sql.Date" => "date"
//    case "java.lang.Long" => "long"
//    case "java.lang.Float" => "float"
//    case "java.lang.Double" => "double"
//    case "java.lang.Integer" => "int"
//    case "java.lang.String" => "string"
//    case "oracle.jdbc.OracleClob" => "string"
//    case "oracle.sql.CLOB" => "string"
    case unknown =>
      throw new Exception("unknown type:"+unknown)
  }
}
