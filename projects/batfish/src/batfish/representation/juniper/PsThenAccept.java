package batfish.representation.juniper;

import batfish.representation.PolicyMapClause;
import batfish.representation.PolicyMapSetLine;

public final class PsThenAccept extends PsThen {

   public static final PsThenAccept INSTANCE = new PsThenAccept();

   /**
    *
    */
   private static final long serialVersionUID = 1L;

   private PsThenAccept() {
   }

   @Override
   public PolicyMapSetLine toPolicyStatmentSetLine() {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public void applyTo(PolicyMapClause clause) {
      throw new UnsupportedOperationException("no implementation for generated method"); // TODO Auto-generated method stub
   }

}
