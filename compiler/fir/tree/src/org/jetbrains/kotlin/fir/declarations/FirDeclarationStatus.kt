/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.declarations

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.descriptors.Modality
import org.jetbrains.kotlin.descriptors.Visibility
import org.jetbrains.kotlin.fir.BaseTransformedType
import org.jetbrains.kotlin.fir.FirElement
import org.jetbrains.kotlin.fir.visitors.FirVisitor

@BaseTransformedType
interface FirDeclarationStatus : FirElement {
    val visibility: Visibility

    val modality: Modality?

    val isExpect: Boolean

    val isActual: Boolean

    val isOverride: Boolean

    val isOperator: Boolean

    val isInfix: Boolean

    val isInline: Boolean

    val isTailRec: Boolean

    val isExternal: Boolean

    val isConst: Boolean

    val isLateInit: Boolean

    val isInner: Boolean

    val isCompanion: Boolean

    val isData: Boolean

    override val psi: PsiElement?
        get() = null

    override fun <R, D> accept(visitor: FirVisitor<R, D>, data: D): R =
        visitor.visitDeclarationStatus(this, data)
}