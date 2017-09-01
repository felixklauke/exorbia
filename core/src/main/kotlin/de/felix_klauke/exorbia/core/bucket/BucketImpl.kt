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

package de.felix_klauke.exorbia.core.bucket

import de.felix_klauke.exorbia.core.document.AbstractDocument
import de.felix_klauke.exorbia.core.document.IDocument
import de.felix_klauke.exorbia.core.document.JsonDocument
import java.io.ByteArrayOutputStream
import java.io.File
import java.io.ObjectOutputStream
import java.nio.file.Files
import java.util.*

/**
 * @author Felix 'SasukeKawaii' Klauke <sasukekawaii@ungespielt.net>
 */
class BucketImpl : IBucket {

    override fun getDocument(identifier: String): JsonDocument {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun <ContentType> saveDocument(document: IDocument<ContentType>) {
        val documentId = document.id()

        val byteOutput = ByteArrayOutputStream()
        val outPutStream: ObjectOutputStream = ObjectOutputStream(byteOutput)

        if (document is AbstractDocument) {
            document.writeToSerializedStream(outPutStream)
        }

        val file: File = File("test.db")
        file.createNewFile()

        Files.write(file.toPath(), byteOutput.toByteArray())

        println(Arrays.toString(byteOutput.toByteArray()))

        byteOutput.close()
        outPutStream.close()
    }

    override fun deleteDocument(identifier: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}