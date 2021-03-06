/*
 * Copyright (c) 2018, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package org.graalvm.visualvm.heapviewer.model;

import java.util.Objects;
import org.graalvm.visualvm.lib.jfluid.heap.Heap;

/**
 *
 * @author Jiri Sedlacek
 */
public class HeapViewerNodeWrapper extends HeapViewerNode {
        
    private final HeapViewerNode node;


    public HeapViewerNodeWrapper(HeapViewerNode node) {
        this.node = node;
    }


    public final HeapViewerNode getNode() {
        return node;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof HeapViewerNodeWrapper)) return false;
        return Objects.equals(node, ((HeapViewerNodeWrapper)o).node);
    }

    @Override
    public int hashCode() {
        return node.hashCode();
    }


    @Override
    public String toString() {
        return node.toString();
    }


    @Override
    protected <T> T getValue(DataType<T> type, Heap heap) {
        return super.getValue(type, heap);
    }

}
