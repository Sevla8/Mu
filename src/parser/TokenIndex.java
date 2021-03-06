/* This file was generated by SableCC (http://www.sablecc.org/). */

package parser;

import node.*;
import analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTAnalysis(@SuppressWarnings("unused") TAnalysis node)
    {
        this.index = 0;
    }

    @Override
    public void caseTAlgebra(@SuppressWarnings("unused") TAlgebra node)
    {
        this.index = 1;
    }

    @Override
    public void caseTSetTheory(@SuppressWarnings("unused") TSetTheory node)
    {
        this.index = 2;
    }

    @Override
    public void caseTGeometry(@SuppressWarnings("unused") TGeometry node)
    {
        this.index = 3;
    }

    @Override
    public void caseTStatisticAndProbability(@SuppressWarnings("unused") TStatisticAndProbability node)
    {
        this.index = 4;
    }

    @Override
    public void caseTCategory(@SuppressWarnings("unused") TCategory node)
    {
        this.index = 5;
    }

    @Override
    public void caseTProof(@SuppressWarnings("unused") TProof node)
    {
        this.index = 6;
    }

    @Override
    public void caseTStatement(@SuppressWarnings("unused") TStatement node)
    {
        this.index = 7;
    }

    @Override
    public void caseTAsk(@SuppressWarnings("unused") TAsk node)
    {
        this.index = 8;
    }

    @Override
    public void caseTLet(@SuppressWarnings("unused") TLet node)
    {
        this.index = 9;
    }

    @Override
    public void caseTDone(@SuppressWarnings("unused") TDone node)
    {
        this.index = 10;
    }

    @Override
    public void caseTShow(@SuppressWarnings("unused") TShow node)
    {
        this.index = 11;
    }

    @Override
    public void caseTThus(@SuppressWarnings("unused") TThus node)
    {
        this.index = 12;
    }

    @Override
    public void caseTDeprivedOf(@SuppressWarnings("unused") TDeprivedOf node)
    {
        this.index = 13;
    }

    @Override
    public void caseTNot(@SuppressWarnings("unused") TNot node)
    {
        this.index = 14;
    }

    @Override
    public void caseTComplex(@SuppressWarnings("unused") TComplex node)
    {
        this.index = 15;
    }

    @Override
    public void caseTReal(@SuppressWarnings("unused") TReal node)
    {
        this.index = 16;
    }

    @Override
    public void caseTRational(@SuppressWarnings("unused") TRational node)
    {
        this.index = 17;
    }

    @Override
    public void caseTInteger(@SuppressWarnings("unused") TInteger node)
    {
        this.index = 18;
    }

    @Override
    public void caseTNatural(@SuppressWarnings("unused") TNatural node)
    {
        this.index = 19;
    }

    @Override
    public void caseTEmptySet(@SuppressWarnings("unused") TEmptySet node)
    {
        this.index = 20;
    }

    @Override
    public void caseTMultiplication(@SuppressWarnings("unused") TMultiplication node)
    {
        this.index = 21;
    }

    @Override
    public void caseTDivision(@SuppressWarnings("unused") TDivision node)
    {
        this.index = 22;
    }

    @Override
    public void caseTModulo(@SuppressWarnings("unused") TModulo node)
    {
        this.index = 23;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 24;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 25;
    }

    @Override
    public void caseTPower(@SuppressWarnings("unused") TPower node)
    {
        this.index = 26;
    }

    @Override
    public void caseTForAll(@SuppressWarnings("unused") TForAll node)
    {
        this.index = 27;
    }

    @Override
    public void caseTExist(@SuppressWarnings("unused") TExist node)
    {
        this.index = 28;
    }

    @Override
    public void caseTSuchAs(@SuppressWarnings("unused") TSuchAs node)
    {
        this.index = 29;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 30;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 31;
    }

    @Override
    public void caseTColumn(@SuppressWarnings("unused") TColumn node)
    {
        this.index = 32;
    }

    @Override
    public void caseTHashtag(@SuppressWarnings("unused") THashtag node)
    {
        this.index = 33;
    }

    @Override
    public void caseTImplicationSign(@SuppressWarnings("unused") TImplicationSign node)
    {
        this.index = 34;
    }

    @Override
    public void caseTEquivalenceSign(@SuppressWarnings("unused") TEquivalenceSign node)
    {
        this.index = 35;
    }

    @Override
    public void caseTLogicalAnd(@SuppressWarnings("unused") TLogicalAnd node)
    {
        this.index = 36;
    }

    @Override
    public void caseTLogicalOr(@SuppressWarnings("unused") TLogicalOr node)
    {
        this.index = 37;
    }

    @Override
    public void caseTUnion(@SuppressWarnings("unused") TUnion node)
    {
        this.index = 38;
    }

    @Override
    public void caseTIntersection(@SuppressWarnings("unused") TIntersection node)
    {
        this.index = 39;
    }

    @Override
    public void caseTSubsetOf(@SuppressWarnings("unused") TSubsetOf node)
    {
        this.index = 40;
    }

    @Override
    public void caseTSupersetOf(@SuppressWarnings("unused") TSupersetOf node)
    {
        this.index = 41;
    }

    @Override
    public void caseTNotASubsetOf(@SuppressWarnings("unused") TNotASubsetOf node)
    {
        this.index = 42;
    }

    @Override
    public void caseTNotASupersetOf(@SuppressWarnings("unused") TNotASupersetOf node)
    {
        this.index = 43;
    }

    @Override
    public void caseTElementOf(@SuppressWarnings("unused") TElementOf node)
    {
        this.index = 44;
    }

    @Override
    public void caseTContainsAsMember(@SuppressWarnings("unused") TContainsAsMember node)
    {
        this.index = 45;
    }

    @Override
    public void caseTNotAnElementOf(@SuppressWarnings("unused") TNotAnElementOf node)
    {
        this.index = 46;
    }

    @Override
    public void caseTDoesNotContainAsMember(@SuppressWarnings("unused") TDoesNotContainAsMember node)
    {
        this.index = 47;
    }

    @Override
    public void caseTLeftBrace(@SuppressWarnings("unused") TLeftBrace node)
    {
        this.index = 48;
    }

    @Override
    public void caseTRightBrace(@SuppressWarnings("unused") TRightBrace node)
    {
        this.index = 49;
    }

    @Override
    public void caseTLeftParenthesis(@SuppressWarnings("unused") TLeftParenthesis node)
    {
        this.index = 50;
    }

    @Override
    public void caseTRightParenthesis(@SuppressWarnings("unused") TRightParenthesis node)
    {
        this.index = 51;
    }

    @Override
    public void caseTLelftBracket(@SuppressWarnings("unused") TLelftBracket node)
    {
        this.index = 52;
    }

    @Override
    public void caseTRightBracket(@SuppressWarnings("unused") TRightBracket node)
    {
        this.index = 53;
    }

    @Override
    public void caseTEqualTo(@SuppressWarnings("unused") TEqualTo node)
    {
        this.index = 54;
    }

    @Override
    public void caseTGreaterThan(@SuppressWarnings("unused") TGreaterThan node)
    {
        this.index = 55;
    }

    @Override
    public void caseTLessThan(@SuppressWarnings("unused") TLessThan node)
    {
        this.index = 56;
    }

    @Override
    public void caseTGreaterThanOrEqualTo(@SuppressWarnings("unused") TGreaterThanOrEqualTo node)
    {
        this.index = 57;
    }

    @Override
    public void caseTLessThanOrEqualTo(@SuppressWarnings("unused") TLessThanOrEqualTo node)
    {
        this.index = 58;
    }

    @Override
    public void caseTNotEqualTo(@SuppressWarnings("unused") TNotEqualTo node)
    {
        this.index = 59;
    }

    @Override
    public void caseTNotGreaterThan(@SuppressWarnings("unused") TNotGreaterThan node)
    {
        this.index = 60;
    }

    @Override
    public void caseTNotLessThan(@SuppressWarnings("unused") TNotLessThan node)
    {
        this.index = 61;
    }

    @Override
    public void caseTNeitherGreaterThanNorEqualTo(@SuppressWarnings("unused") TNeitherGreaterThanNorEqualTo node)
    {
        this.index = 62;
    }

    @Override
    public void caseTNeitherLessThanNorEqualTo(@SuppressWarnings("unused") TNeitherLessThanNorEqualTo node)
    {
        this.index = 63;
    }

    @Override
    public void caseTNumber(@SuppressWarnings("unused") TNumber node)
    {
        this.index = 64;
    }

    @Override
    public void caseTSetIdentifier(@SuppressWarnings("unused") TSetIdentifier node)
    {
        this.index = 65;
    }

    @Override
    public void caseTElementIdentifier(@SuppressWarnings("unused") TElementIdentifier node)
    {
        this.index = 66;
    }

    @Override
    public void caseTString(@SuppressWarnings("unused") TString node)
    {
        this.index = 67;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 68;
    }
}
