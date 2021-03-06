/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema.tables;


import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.meta.h2.information_schema.InformationSchema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables extends TableImpl<Record> {

    private static final long serialVersionUID = 81708874;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public static final TableField<Record, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public static final TableField<Record, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public static final TableField<Record, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public static final TableField<Record, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
     */
    public static final TableField<Record, String> STORAGE_TYPE = createField(DSL.name("STORAGE_TYPE"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.SQL</code>.
     */
    public static final TableField<Record, String> SQL = createField(DSL.name("SQL"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
     */
    public static final TableField<Record, String> REMARKS = createField(DSL.name("REMARKS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
     */
    public static final TableField<Record, Long> LAST_MODIFICATION = createField(DSL.name("LAST_MODIFICATION"), org.jooq.impl.SQLDataType.BIGINT, TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.ID</code>.
     */
    public static final TableField<Record, Integer> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.INTEGER, TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TYPE_NAME</code>.
     */
    public static final TableField<Record, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
     */
    public static final TableField<Record, String> TABLE_CLASS = createField(DSL.name("TABLE_CLASS"), org.jooq.impl.SQLDataType.VARCHAR(2147483647), TABLES, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
     */
    public static final TableField<Record, Long> ROW_COUNT_ESTIMATE = createField(DSL.name("ROW_COUNT_ESTIMATE"), org.jooq.impl.SQLDataType.BIGINT, TABLES, "");

    /**
     * No further instances allowed
     */
    private Tables() {
        this(DSL.name("TABLES"), null);
    }

    private Tables(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private Tables(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> Tables(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, TABLES);
    }

    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }
}
