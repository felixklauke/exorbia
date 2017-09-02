/*
 * MIT License
 *
 * Copyright (c) 2017 Felix Klauke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package de.felix_klauke.exorbia.core.json

import de.felix_klauke.exorbia.core.store.IStorable
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import org.json.JSONPointer

import java.io.IOException
import java.io.ObjectOutput
import java.io.Writer
import java.math.BigDecimal
import java.math.BigInteger

/**
 * @author Felix 'SasukeKawaii' Klauke <sasukekawaii></sasukekawaii>@ungespielt.net>
 */
class StorableJSONObjectAdapter @JvmOverloads constructor(private val jsonObject: JSONObject = JSONObject()) : JSONObject(), IStorable {

    @Throws(IOException::class)
    override fun store(objectOutput: ObjectOutput) {
        objectOutput.writeBytes(toString(4))
    }

    @Throws(JSONException::class)
    override fun accumulate(key: String, value: Any): JSONObject {
        return jsonObject.accumulate(key, value)
    }

    @Throws(JSONException::class)
    override fun append(key: String, value: Any): JSONObject {
        return jsonObject.append(key, value)
    }

    @Throws(JSONException::class)
    override fun get(key: String): Any {
        return jsonObject.get(key)
    }

    @Throws(JSONException::class)
    override fun <E : Enum<E>> getEnum(clazz: Class<E>, key: String): E {
        return jsonObject.getEnum(clazz, key)
    }

    @Throws(JSONException::class)
    override fun getBoolean(key: String): Boolean {
        return jsonObject.getBoolean(key)
    }

    @Throws(JSONException::class)
    override fun getBigInteger(key: String): BigInteger {
        return jsonObject.getBigInteger(key)
    }

    @Throws(JSONException::class)
    override fun getBigDecimal(key: String): BigDecimal {
        return jsonObject.getBigDecimal(key)
    }

    @Throws(JSONException::class)
    override fun getDouble(key: String): Double {
        return jsonObject.getDouble(key)
    }

    @Throws(JSONException::class)
    override fun getInt(key: String): Int {
        return jsonObject.getInt(key)
    }

    @Throws(JSONException::class)
    override fun getJSONArray(key: String): JSONArray {
        return jsonObject.getJSONArray(key)
    }

    @Throws(JSONException::class)
    override fun getJSONObject(key: String): JSONObject {
        return jsonObject.getJSONObject(key)
    }

    @Throws(JSONException::class)
    override fun getLong(key: String): Long {
        return jsonObject.getLong(key)
    }

    @Throws(JSONException::class)
    override fun getString(key: String): String {
        return jsonObject.getString(key)
    }

    override fun has(key: String): Boolean {
        return jsonObject.has(key)
    }

    @Throws(JSONException::class)
    override fun increment(key: String): JSONObject {
        return jsonObject.increment(key)
    }

    override fun isNull(key: String): Boolean {
        return jsonObject.isNull(key)
    }

    override fun keys(): Iterator<String> {
        return jsonObject.keys()
    }

    override fun keySet(): Set<String> {
        return jsonObject.keySet()
    }

    override fun length(): Int {
        return jsonObject.length()
    }

    override fun names(): JSONArray {
        return jsonObject.names()
    }

    override fun opt(key: String?): Any {
        return jsonObject.opt(key)
    }

    override fun <E : Enum<E>> optEnum(clazz: Class<E>, key: String): E {
        return jsonObject.optEnum(clazz, key)
    }

    override fun <E : Enum<E>> optEnum(clazz: Class<E>, key: String, defaultValue: E): E {
        return jsonObject.optEnum(clazz, key, defaultValue)
    }

    override fun optBoolean(key: String): Boolean {
        return jsonObject.optBoolean(key)
    }

    override fun optBoolean(key: String, defaultValue: Boolean): Boolean {
        return jsonObject.optBoolean(key, defaultValue)
    }

    override fun optDouble(key: String): Double {
        return jsonObject.optDouble(key)
    }

    override fun optBigInteger(key: String, defaultValue: BigInteger): BigInteger {
        return jsonObject.optBigInteger(key, defaultValue)
    }

    override fun optBigDecimal(key: String, defaultValue: BigDecimal): BigDecimal {
        return jsonObject.optBigDecimal(key, defaultValue)
    }

    override fun optDouble(key: String, defaultValue: Double): Double {
        return jsonObject.optDouble(key, defaultValue)
    }

    override fun optInt(key: String): Int {
        return jsonObject.optInt(key)
    }

    override fun optInt(key: String, defaultValue: Int): Int {
        return jsonObject.optInt(key, defaultValue)
    }

    override fun optJSONArray(key: String): JSONArray {
        return jsonObject.optJSONArray(key)
    }

    override fun optJSONObject(key: String): JSONObject {
        return jsonObject.optJSONObject(key)
    }

    override fun optLong(key: String): Long {
        return jsonObject.optLong(key)
    }

    override fun optLong(key: String, defaultValue: Long): Long {
        return jsonObject.optLong(key, defaultValue)
    }

    override fun optString(key: String): String {
        return jsonObject.optString(key)
    }

    override fun optString(key: String, defaultValue: String): String {
        return jsonObject.optString(key, defaultValue)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Boolean): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Collection<*>?): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Double): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Int): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Long): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Map<*, *>?): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun put(key: String, value: Any?): JSONObject {
        return jsonObject.put(key, value)
    }

    @Throws(JSONException::class)
    override fun putOnce(key: String?, value: Any?): JSONObject {
        return jsonObject.putOnce(key, value)
    }

    @Throws(JSONException::class)
    override fun putOpt(key: String?, value: Any?): JSONObject {
        return jsonObject.putOpt(key, value)
    }

    override fun query(jsonPointer: String): Any {
        return jsonObject.query(jsonPointer)
    }

    override fun query(jsonPointer: JSONPointer): Any {
        return jsonObject.query(jsonPointer)
    }

    override fun optQuery(jsonPointer: String): Any {
        return jsonObject.optQuery(jsonPointer)
    }

    override fun optQuery(jsonPointer: JSONPointer): Any {
        return jsonObject.optQuery(jsonPointer)
    }

    override fun remove(key: String): Any {
        return jsonObject.remove(key)
    }

    override fun similar(other: Any?): Boolean {
        return jsonObject.similar(other)
    }

    @Throws(JSONException::class)
    override fun toJSONArray(names: JSONArray?): JSONArray {
        return jsonObject.toJSONArray(names)
    }

    override fun toString(): String {
        return jsonObject.toString()
    }

    @Throws(JSONException::class)
    override fun toString(indentFactor: Int): String {
        return jsonObject.toString(indentFactor)
    }

    @Throws(JSONException::class)
    override fun write(writer: Writer): Writer {
        return jsonObject.write(writer)
    }

    @Throws(JSONException::class)
    override fun write(writer: Writer, indentFactor: Int, indent: Int): Writer {
        return jsonObject.write(writer, indentFactor, indent)
    }

    override fun toMap(): Map<String, Any> {
        return jsonObject.toMap()
    }
}
