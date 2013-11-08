package arduinoml.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import arduinoml.services.AMLXGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAMLXParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Machine'", "'{'", "'start'", "'bricks'", "','", "'}'", "'states'", "'State'", "'transitions'", "'actions'", "'-'", "'Sensor'", "'pin'", "'Actuator'", "'Transition'", "'goto'", "'conditions'", "'DigitalAction'", "'bState'", "'actuator'", "'DigitalSensorCondition'", "'sensor'", "'TimeCondition'", "'time'", "'tComp'", "'DigitalBrickState'", "'Comparison'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAMLXParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAMLXParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAMLXParser.tokenNames; }
    public String getGrammarFileName() { return "../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g"; }



     	private AMLXGrammarAccess grammarAccess;
     	
        public InternalAMLXParser(TokenStream input, AMLXGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Machine";	
       	}
       	
       	@Override
       	protected AMLXGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMachine"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:67:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:68:2: (iv_ruleMachine= ruleMachine EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:69:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleMachine_in_entryRuleMachine75);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleMachine85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:76:1: ruleMachine returns [EObject current=null] : (otherlv_0= 'Machine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}' )? otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleState ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        EObject lv_bricks_6_0 = null;

        EObject lv_bricks_8_0 = null;

        EObject lv_states_12_0 = null;

        EObject lv_states_14_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:79:28: ( (otherlv_0= 'Machine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}' )? otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleState ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:80:1: (otherlv_0= 'Machine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}' )? otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleState ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:80:1: (otherlv_0= 'Machine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}' )? otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleState ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:80:3: otherlv_0= 'Machine' otherlv_1= '{' otherlv_2= 'start' ( ( ruleEString ) ) (otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}' )? otherlv_10= 'states' otherlv_11= '{' ( (lv_states_12_0= ruleState ) ) (otherlv_13= ',' ( (lv_states_14_0= ruleState ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleMachine122); 

                	newLeafNode(otherlv_0, grammarAccess.getMachineAccess().getMachineKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMachine134); 

                	newLeafNode(otherlv_1, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleMachine146); 

                	newLeafNode(otherlv_2, grammarAccess.getMachineAccess().getStartKeyword_2());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:92:1: ( ( ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:93:1: ( ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:93:1: ( ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:94:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getMachineRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getMachineAccess().getStartStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleMachine169);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:107:2: (otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:107:4: otherlv_4= 'bricks' otherlv_5= '{' ( (lv_bricks_6_0= ruleBrick ) ) (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleMachine182); 

                        	newLeafNode(otherlv_4, grammarAccess.getMachineAccess().getBricksKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMachine194); 

                        	newLeafNode(otherlv_5, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:115:1: ( (lv_bricks_6_0= ruleBrick ) )
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:116:1: (lv_bricks_6_0= ruleBrick )
                    {
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:116:1: (lv_bricks_6_0= ruleBrick )
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:117:3: lv_bricks_6_0= ruleBrick
                    {
                     
                    	        newCompositeNode(grammarAccess.getMachineAccess().getBricksBrickParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBrick_in_ruleMachine215);
                    lv_bricks_6_0=ruleBrick();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	        }
                           		add(
                           			current, 
                           			"bricks",
                            		lv_bricks_6_0, 
                            		"Brick");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:133:2: (otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:133:4: otherlv_7= ',' ( (lv_bricks_8_0= ruleBrick ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine228); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getMachineAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:137:1: ( (lv_bricks_8_0= ruleBrick ) )
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:138:1: (lv_bricks_8_0= ruleBrick )
                    	    {
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:138:1: (lv_bricks_8_0= ruleBrick )
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:139:3: lv_bricks_8_0= ruleBrick
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getMachineAccess().getBricksBrickParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleBrick_in_ruleMachine249);
                    	    lv_bricks_8_0=ruleBrick();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"bricks",
                    	            		lv_bricks_8_0, 
                    	            		"Brick");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine263); 

                        	newLeafNode(otherlv_9, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleMachine277); 

                	newLeafNode(otherlv_10, grammarAccess.getMachineAccess().getStatesKeyword_5());
                
            otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleMachine289); 

                	newLeafNode(otherlv_11, grammarAccess.getMachineAccess().getLeftCurlyBracketKeyword_6());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:167:1: ( (lv_states_12_0= ruleState ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:168:1: (lv_states_12_0= ruleState )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:168:1: (lv_states_12_0= ruleState )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:169:3: lv_states_12_0= ruleState
            {
             
            	        newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleMachine310);
            lv_states_12_0=ruleState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	        }
                   		add(
                   			current, 
                   			"states",
                    		lv_states_12_0, 
                    		"State");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:185:2: (otherlv_13= ',' ( (lv_states_14_0= ruleState ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:185:4: otherlv_13= ',' ( (lv_states_14_0= ruleState ) )
            	    {
            	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleMachine323); 

            	        	newLeafNode(otherlv_13, grammarAccess.getMachineAccess().getCommaKeyword_8_0());
            	        
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:189:1: ( (lv_states_14_0= ruleState ) )
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:190:1: (lv_states_14_0= ruleState )
            	    {
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:190:1: (lv_states_14_0= ruleState )
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:191:3: lv_states_14_0= ruleState
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMachineAccess().getStatesStateParserRuleCall_8_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleState_in_ruleMachine344);
            	    lv_states_14_0=ruleState();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMachineRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"states",
            	            		lv_states_14_0, 
            	            		"State");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine358); 

                	newLeafNode(otherlv_15, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_9());
                
            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleMachine370); 

                	newLeafNode(otherlv_16, grammarAccess.getMachineAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleBrick"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:223:1: entryRuleBrick returns [EObject current=null] : iv_ruleBrick= ruleBrick EOF ;
    public final EObject entryRuleBrick() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBrick = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:224:2: (iv_ruleBrick= ruleBrick EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:225:2: iv_ruleBrick= ruleBrick EOF
            {
             newCompositeNode(grammarAccess.getBrickRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBrick_in_entryRuleBrick406);
            iv_ruleBrick=ruleBrick();

            state._fsp--;

             current =iv_ruleBrick; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBrick416); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBrick"


    // $ANTLR start "ruleBrick"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:232:1: ruleBrick returns [EObject current=null] : (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) ;
    public final EObject ruleBrick() throws RecognitionException {
        EObject current = null;

        EObject this_Sensor_0 = null;

        EObject this_Actuator_1 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:235:28: ( (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:236:1: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:236:1: (this_Sensor_0= ruleSensor | this_Actuator_1= ruleActuator )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                alt4=1;
            }
            else if ( (LA4_0==24) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:237:5: this_Sensor_0= ruleSensor
                    {
                     
                            newCompositeNode(grammarAccess.getBrickAccess().getSensorParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleSensor_in_ruleBrick463);
                    this_Sensor_0=ruleSensor();

                    state._fsp--;

                     
                            current = this_Sensor_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:247:5: this_Actuator_1= ruleActuator
                    {
                     
                            newCompositeNode(grammarAccess.getBrickAccess().getActuatorParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleActuator_in_ruleBrick490);
                    this_Actuator_1=ruleActuator();

                    state._fsp--;

                     
                            current = this_Actuator_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBrick"


    // $ANTLR start "entryRuleCondition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:263:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:264:2: (iv_ruleCondition= ruleCondition EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:265:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition525);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition535); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:272:1: ruleCondition returns [EObject current=null] : (this_DigitalSensorCondition_0= ruleDigitalSensorCondition | this_TimeCondition_1= ruleTimeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_DigitalSensorCondition_0 = null;

        EObject this_TimeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:275:28: ( (this_DigitalSensorCondition_0= ruleDigitalSensorCondition | this_TimeCondition_1= ruleTimeCondition ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:276:1: (this_DigitalSensorCondition_0= ruleDigitalSensorCondition | this_TimeCondition_1= ruleTimeCondition )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:276:1: (this_DigitalSensorCondition_0= ruleDigitalSensorCondition | this_TimeCondition_1= ruleTimeCondition )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==31) ) {
                alt5=1;
            }
            else if ( (LA5_0==33) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:277:5: this_DigitalSensorCondition_0= ruleDigitalSensorCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getDigitalSensorConditionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleDigitalSensorCondition_in_ruleCondition582);
                    this_DigitalSensorCondition_0=ruleDigitalSensorCondition();

                    state._fsp--;

                     
                            current = this_DigitalSensorCondition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:287:5: this_TimeCondition_1= ruleTimeCondition
                    {
                     
                            newCompositeNode(grammarAccess.getConditionAccess().getTimeConditionParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleTimeCondition_in_ruleCondition609);
                    this_TimeCondition_1=ruleTimeCondition();

                    state._fsp--;

                     
                            current = this_TimeCondition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleState"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:303:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:304:2: (iv_ruleState= ruleState EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:305:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleState_in_entryRuleState644);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleState654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:312:1: ruleState returns [EObject current=null] : ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? (otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_transitions_6_0 = null;

        EObject lv_transitions_8_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_actions_14_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:315:28: ( ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? (otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:316:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? (otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:316:1: ( () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? (otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:316:2: () otherlv_1= 'State' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )? (otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:316:2: ()
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:317:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateAccess().getStateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleState700); 

                	newLeafNode(otherlv_1, grammarAccess.getStateAccess().getStateKeyword_1());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:326:1: ( (lv_name_2_0= ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:327:1: (lv_name_2_0= ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:327:1: (lv_name_2_0= ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:328:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getStateAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleState721);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState733); 

                	newLeafNode(otherlv_3, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:348:1: (otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:348:3: otherlv_4= 'transitions' otherlv_5= '{' ( (lv_transitions_6_0= ruleTransition ) ) (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleState746); 

                        	newLeafNode(otherlv_4, grammarAccess.getStateAccess().getTransitionsKeyword_4_0());
                        
                    otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState758); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_4_1());
                        
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:356:1: ( (lv_transitions_6_0= ruleTransition ) )
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:357:1: (lv_transitions_6_0= ruleTransition )
                    {
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:357:1: (lv_transitions_6_0= ruleTransition )
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:358:3: lv_transitions_6_0= ruleTransition
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState779);
                    lv_transitions_6_0=ruleTransition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"transitions",
                            		lv_transitions_6_0, 
                            		"Transition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:374:2: (otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==15) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:374:4: otherlv_7= ',' ( (lv_transitions_8_0= ruleTransition ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState792); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getStateAccess().getCommaKeyword_4_3_0());
                    	        
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:378:1: ( (lv_transitions_8_0= ruleTransition ) )
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:379:1: (lv_transitions_8_0= ruleTransition )
                    	    {
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:379:1: (lv_transitions_8_0= ruleTransition )
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:380:3: lv_transitions_8_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleTransition_in_ruleState813);
                    	    lv_transitions_8_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_8_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState827); 

                        	newLeafNode(otherlv_9, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_4_4());
                        

                    }
                    break;

            }

            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:400:3: (otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:400:5: otherlv_10= 'actions' otherlv_11= '{' ( (lv_actions_12_0= ruleDigitalAction ) ) (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleState842); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateAccess().getActionsKeyword_5_0());
                        
                    otherlv_11=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleState854); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_5_1());
                        
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:408:1: ( (lv_actions_12_0= ruleDigitalAction ) )
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:409:1: (lv_actions_12_0= ruleDigitalAction )
                    {
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:409:1: (lv_actions_12_0= ruleDigitalAction )
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:410:3: lv_actions_12_0= ruleDigitalAction
                    {
                     
                    	        newCompositeNode(grammarAccess.getStateAccess().getActionsDigitalActionParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleDigitalAction_in_ruleState875);
                    lv_actions_12_0=ruleDigitalAction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	        }
                           		add(
                           			current, 
                           			"actions",
                            		lv_actions_12_0, 
                            		"DigitalAction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:426:2: (otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:426:4: otherlv_13= ',' ( (lv_actions_14_0= ruleDigitalAction ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleState888); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getStateAccess().getCommaKeyword_5_3_0());
                    	        
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:430:1: ( (lv_actions_14_0= ruleDigitalAction ) )
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:431:1: (lv_actions_14_0= ruleDigitalAction )
                    	    {
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:431:1: (lv_actions_14_0= ruleDigitalAction )
                    	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:432:3: lv_actions_14_0= ruleDigitalAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateAccess().getActionsDigitalActionParserRuleCall_5_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleDigitalAction_in_ruleState909);
                    	    lv_actions_14_0=ruleDigitalAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_14_0, 
                    	            		"DigitalAction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState923); 

                        	newLeafNode(otherlv_15, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_5_4());
                        

                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleState937); 

                	newLeafNode(otherlv_16, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleEString"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:464:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:465:2: (iv_ruleEString= ruleEString EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:466:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString974);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString985); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:473:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:476:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:477:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:477:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:477:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1025); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:485:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1051); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:500:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:501:2: (iv_ruleEInt= ruleEInt EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:502:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1097);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1108); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:509:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:512:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:513:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:513:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:513:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:513:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:514:2: kw= '-'
                    {
                    kw=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleEInt1147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1164); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleSensor"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:534:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:535:2: (iv_ruleSensor= ruleSensor EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:536:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSensor_in_entryRuleSensor1209);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSensor1219); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:543:1: ruleSensor returns [EObject current=null] : (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:546:28: ( (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:547:1: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:547:1: (otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:547:3: otherlv_0= 'Sensor' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleSensor1256); 

                	newLeafNode(otherlv_0, grammarAccess.getSensorAccess().getSensorKeyword_0());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:551:1: ( (lv_name_1_0= ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:552:1: (lv_name_1_0= ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:552:1: (lv_name_1_0= ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:553:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSensorAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSensor1277);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleSensor1289); 

                	newLeafNode(otherlv_2, grammarAccess.getSensorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleSensor1301); 

                	newLeafNode(otherlv_3, grammarAccess.getSensorAccess().getPinKeyword_3());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:577:1: ( (lv_pin_4_0= ruleEInt ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:578:1: (lv_pin_4_0= ruleEInt )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:578:1: (lv_pin_4_0= ruleEInt )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:579:3: lv_pin_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getSensorAccess().getPinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleSensor1322);
            lv_pin_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSensorRule());
            	        }
                   		set(
                   			current, 
                   			"pin",
                    		lv_pin_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSensor1334); 

                	newLeafNode(otherlv_5, grammarAccess.getSensorAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleActuator"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:607:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:608:2: (iv_ruleActuator= ruleActuator EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:609:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleActuator_in_entryRuleActuator1370);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleActuator1380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:616:1: ruleActuator returns [EObject current=null] : (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_pin_4_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:619:28: ( (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:620:1: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:620:1: (otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:620:3: otherlv_0= 'Actuator' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'pin' ( (lv_pin_4_0= ruleEInt ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleActuator1417); 

                	newLeafNode(otherlv_0, grammarAccess.getActuatorAccess().getActuatorKeyword_0());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:624:1: ( (lv_name_1_0= ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:625:1: (lv_name_1_0= ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:625:1: (lv_name_1_0= ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:626:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActuatorAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleActuator1438);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActuatorRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleActuator1450); 

                	newLeafNode(otherlv_2, grammarAccess.getActuatorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleActuator1462); 

                	newLeafNode(otherlv_3, grammarAccess.getActuatorAccess().getPinKeyword_3());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:650:1: ( (lv_pin_4_0= ruleEInt ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:651:1: (lv_pin_4_0= ruleEInt )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:651:1: (lv_pin_4_0= ruleEInt )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:652:3: lv_pin_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getActuatorAccess().getPinEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleActuator1483);
            lv_pin_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActuatorRule());
            	        }
                   		set(
                   			current, 
                   			"pin",
                    		lv_pin_4_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleActuator1495); 

                	newLeafNode(otherlv_5, grammarAccess.getActuatorAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleTransition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:680:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:681:2: (iv_ruleTransition= ruleTransition EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:682:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTransition_in_entryRuleTransition1531);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTransition1541); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:689:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'goto' ( ( ruleEString ) ) otherlv_4= 'conditions' otherlv_5= '{' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) ) )* otherlv_9= '}' otherlv_10= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_conditions_6_0 = null;

        EObject lv_conditions_8_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:692:28: ( (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'goto' ( ( ruleEString ) ) otherlv_4= 'conditions' otherlv_5= '{' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) ) )* otherlv_9= '}' otherlv_10= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:693:1: (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'goto' ( ( ruleEString ) ) otherlv_4= 'conditions' otherlv_5= '{' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) ) )* otherlv_9= '}' otherlv_10= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:693:1: (otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'goto' ( ( ruleEString ) ) otherlv_4= 'conditions' otherlv_5= '{' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) ) )* otherlv_9= '}' otherlv_10= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:693:3: otherlv_0= 'Transition' otherlv_1= '{' otherlv_2= 'goto' ( ( ruleEString ) ) otherlv_4= 'conditions' otherlv_5= '{' ( (lv_conditions_6_0= ruleCondition ) ) (otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) ) )* otherlv_9= '}' otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTransition1578); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition1590); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTransition1602); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getGotoKeyword_2());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:705:1: ( ( ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:706:1: ( ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:706:1: ( ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:707:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getGotoStateCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTransition1625);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTransition1637); 

                	newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getConditionsKeyword_4());
                
            otherlv_5=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTransition1649); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_5());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:728:1: ( (lv_conditions_6_0= ruleCondition ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:729:1: (lv_conditions_6_0= ruleCondition )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:729:1: (lv_conditions_6_0= ruleCondition )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:730:3: lv_conditions_6_0= ruleCondition
            {
             
            	        newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleTransition1670);
            lv_conditions_6_0=ruleCondition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	        }
                   		add(
                   			current, 
                   			"conditions",
                    		lv_conditions_6_0, 
                    		"Condition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:746:2: (otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==15) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:746:4: otherlv_7= ',' ( (lv_conditions_8_0= ruleCondition ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTransition1683); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getCommaKeyword_7_0());
            	        
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:750:1: ( (lv_conditions_8_0= ruleCondition ) )
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:751:1: (lv_conditions_8_0= ruleCondition )
            	    {
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:751:1: (lv_conditions_8_0= ruleCondition )
            	    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:752:3: lv_conditions_8_0= ruleCondition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTransitionAccess().getConditionsConditionParserRuleCall_7_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleTransition1704);
            	    lv_conditions_8_0=ruleCondition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTransitionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"conditions",
            	            		lv_conditions_8_0, 
            	            		"Condition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransition1718); 

                	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_8());
                
            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTransition1730); 

                	newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_9());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleDigitalAction"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:784:1: entryRuleDigitalAction returns [EObject current=null] : iv_ruleDigitalAction= ruleDigitalAction EOF ;
    public final EObject entryRuleDigitalAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalAction = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:785:2: (iv_ruleDigitalAction= ruleDigitalAction EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:786:2: iv_ruleDigitalAction= ruleDigitalAction EOF
            {
             newCompositeNode(grammarAccess.getDigitalActionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDigitalAction_in_entryRuleDigitalAction1766);
            iv_ruleDigitalAction=ruleDigitalAction();

            state._fsp--;

             current =iv_ruleDigitalAction; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDigitalAction1776); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalAction"


    // $ANTLR start "ruleDigitalAction"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:793:1: ruleDigitalAction returns [EObject current=null] : (otherlv_0= 'DigitalAction' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDigitalAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_bState_3_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:796:28: ( (otherlv_0= 'DigitalAction' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:797:1: (otherlv_0= 'DigitalAction' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:797:1: (otherlv_0= 'DigitalAction' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:797:3: otherlv_0= 'DigitalAction' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'actuator' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleDigitalAction1813); 

                	newLeafNode(otherlv_0, grammarAccess.getDigitalActionAccess().getDigitalActionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDigitalAction1825); 

                	newLeafNode(otherlv_1, grammarAccess.getDigitalActionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDigitalAction1837); 

                	newLeafNode(otherlv_2, grammarAccess.getDigitalActionAccess().getBStateKeyword_2());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:809:1: ( (lv_bState_3_0= ruleDigitalBrickState ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:810:1: (lv_bState_3_0= ruleDigitalBrickState )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:810:1: (lv_bState_3_0= ruleDigitalBrickState )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:811:3: lv_bState_3_0= ruleDigitalBrickState
            {
             
            	        newCompositeNode(grammarAccess.getDigitalActionAccess().getBStateDigitalBrickStateParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDigitalBrickState_in_ruleDigitalAction1858);
            lv_bState_3_0=ruleDigitalBrickState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDigitalActionRule());
            	        }
                   		set(
                   			current, 
                   			"bState",
                    		lv_bState_3_0, 
                    		"DigitalBrickState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDigitalAction1870); 

                	newLeafNode(otherlv_4, grammarAccess.getDigitalActionAccess().getActuatorKeyword_4());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:831:1: ( ( ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:832:1: ( ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:832:1: ( ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:833:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDigitalActionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDigitalActionAccess().getActuatorActuatorCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDigitalAction1893);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDigitalAction1905); 

                	newLeafNode(otherlv_6, grammarAccess.getDigitalActionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalAction"


    // $ANTLR start "entryRuleDigitalSensorCondition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:858:1: entryRuleDigitalSensorCondition returns [EObject current=null] : iv_ruleDigitalSensorCondition= ruleDigitalSensorCondition EOF ;
    public final EObject entryRuleDigitalSensorCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDigitalSensorCondition = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:859:2: (iv_ruleDigitalSensorCondition= ruleDigitalSensorCondition EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:860:2: iv_ruleDigitalSensorCondition= ruleDigitalSensorCondition EOF
            {
             newCompositeNode(grammarAccess.getDigitalSensorConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDigitalSensorCondition_in_entryRuleDigitalSensorCondition1941);
            iv_ruleDigitalSensorCondition=ruleDigitalSensorCondition();

            state._fsp--;

             current =iv_ruleDigitalSensorCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDigitalSensorCondition1951); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalSensorCondition"


    // $ANTLR start "ruleDigitalSensorCondition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:867:1: ruleDigitalSensorCondition returns [EObject current=null] : (otherlv_0= 'DigitalSensorCondition' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleDigitalSensorCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_bState_3_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:870:28: ( (otherlv_0= 'DigitalSensorCondition' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:871:1: (otherlv_0= 'DigitalSensorCondition' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:871:1: (otherlv_0= 'DigitalSensorCondition' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:871:3: otherlv_0= 'DigitalSensorCondition' otherlv_1= '{' otherlv_2= 'bState' ( (lv_bState_3_0= ruleDigitalBrickState ) ) otherlv_4= 'sensor' ( ( ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleDigitalSensorCondition1988); 

                	newLeafNode(otherlv_0, grammarAccess.getDigitalSensorConditionAccess().getDigitalSensorConditionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDigitalSensorCondition2000); 

                	newLeafNode(otherlv_1, grammarAccess.getDigitalSensorConditionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDigitalSensorCondition2012); 

                	newLeafNode(otherlv_2, grammarAccess.getDigitalSensorConditionAccess().getBStateKeyword_2());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:883:1: ( (lv_bState_3_0= ruleDigitalBrickState ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:884:1: (lv_bState_3_0= ruleDigitalBrickState )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:884:1: (lv_bState_3_0= ruleDigitalBrickState )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:885:3: lv_bState_3_0= ruleDigitalBrickState
            {
             
            	        newCompositeNode(grammarAccess.getDigitalSensorConditionAccess().getBStateDigitalBrickStateParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDigitalBrickState_in_ruleDigitalSensorCondition2033);
            lv_bState_3_0=ruleDigitalBrickState();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDigitalSensorConditionRule());
            	        }
                   		set(
                   			current, 
                   			"bState",
                    		lv_bState_3_0, 
                    		"DigitalBrickState");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleDigitalSensorCondition2045); 

                	newLeafNode(otherlv_4, grammarAccess.getDigitalSensorConditionAccess().getSensorKeyword_4());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:905:1: ( ( ruleEString ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:906:1: ( ruleEString )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:906:1: ( ruleEString )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:907:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDigitalSensorConditionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDigitalSensorConditionAccess().getSensorSensorCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDigitalSensorCondition2068);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleDigitalSensorCondition2080); 

                	newLeafNode(otherlv_6, grammarAccess.getDigitalSensorConditionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalSensorCondition"


    // $ANTLR start "entryRuleTimeCondition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:932:1: entryRuleTimeCondition returns [EObject current=null] : iv_ruleTimeCondition= ruleTimeCondition EOF ;
    public final EObject entryRuleTimeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeCondition = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:933:2: (iv_ruleTimeCondition= ruleTimeCondition EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:934:2: iv_ruleTimeCondition= ruleTimeCondition EOF
            {
             newCompositeNode(grammarAccess.getTimeConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleTimeCondition_in_entryRuleTimeCondition2116);
            iv_ruleTimeCondition=ruleTimeCondition();

            state._fsp--;

             current =iv_ruleTimeCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeCondition2126); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTimeCondition"


    // $ANTLR start "ruleTimeCondition"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:941:1: ruleTimeCondition returns [EObject current=null] : (otherlv_0= 'TimeCondition' otherlv_1= '{' otherlv_2= 'time' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= 'tComp' ( (lv_tComp_5_0= ruleComparison ) ) otherlv_6= '}' ) ;
    public final EObject ruleTimeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_time_3_0 = null;

        AntlrDatatypeRuleToken lv_tComp_5_0 = null;


         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:944:28: ( (otherlv_0= 'TimeCondition' otherlv_1= '{' otherlv_2= 'time' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= 'tComp' ( (lv_tComp_5_0= ruleComparison ) ) otherlv_6= '}' ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:945:1: (otherlv_0= 'TimeCondition' otherlv_1= '{' otherlv_2= 'time' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= 'tComp' ( (lv_tComp_5_0= ruleComparison ) ) otherlv_6= '}' )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:945:1: (otherlv_0= 'TimeCondition' otherlv_1= '{' otherlv_2= 'time' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= 'tComp' ( (lv_tComp_5_0= ruleComparison ) ) otherlv_6= '}' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:945:3: otherlv_0= 'TimeCondition' otherlv_1= '{' otherlv_2= 'time' ( (lv_time_3_0= ruleEInt ) ) otherlv_4= 'tComp' ( (lv_tComp_5_0= ruleComparison ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTimeCondition2163); 

                	newLeafNode(otherlv_0, grammarAccess.getTimeConditionAccess().getTimeConditionKeyword_0());
                
            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleTimeCondition2175); 

                	newLeafNode(otherlv_1, grammarAccess.getTimeConditionAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTimeCondition2187); 

                	newLeafNode(otherlv_2, grammarAccess.getTimeConditionAccess().getTimeKeyword_2());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:957:1: ( (lv_time_3_0= ruleEInt ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:958:1: (lv_time_3_0= ruleEInt )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:958:1: (lv_time_3_0= ruleEInt )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:959:3: lv_time_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getTimeConditionAccess().getTimeEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleTimeCondition2208);
            lv_time_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeConditionRule());
            	        }
                   		set(
                   			current, 
                   			"time",
                    		lv_time_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTimeCondition2220); 

                	newLeafNode(otherlv_4, grammarAccess.getTimeConditionAccess().getTCompKeyword_4());
                
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:979:1: ( (lv_tComp_5_0= ruleComparison ) )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:980:1: (lv_tComp_5_0= ruleComparison )
            {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:980:1: (lv_tComp_5_0= ruleComparison )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:981:3: lv_tComp_5_0= ruleComparison
            {
             
            	        newCompositeNode(grammarAccess.getTimeConditionAccess().getTCompComparisonParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleComparison_in_ruleTimeCondition2241);
            lv_tComp_5_0=ruleComparison();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTimeConditionRule());
            	        }
                   		set(
                   			current, 
                   			"tComp",
                    		lv_tComp_5_0, 
                    		"Comparison");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTimeCondition2253); 

                	newLeafNode(otherlv_6, grammarAccess.getTimeConditionAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeCondition"


    // $ANTLR start "entryRuleDigitalBrickState"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1009:1: entryRuleDigitalBrickState returns [String current=null] : iv_ruleDigitalBrickState= ruleDigitalBrickState EOF ;
    public final String entryRuleDigitalBrickState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDigitalBrickState = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1010:2: (iv_ruleDigitalBrickState= ruleDigitalBrickState EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1011:2: iv_ruleDigitalBrickState= ruleDigitalBrickState EOF
            {
             newCompositeNode(grammarAccess.getDigitalBrickStateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDigitalBrickState_in_entryRuleDigitalBrickState2290);
            iv_ruleDigitalBrickState=ruleDigitalBrickState();

            state._fsp--;

             current =iv_ruleDigitalBrickState.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDigitalBrickState2301); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDigitalBrickState"


    // $ANTLR start "ruleDigitalBrickState"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1018:1: ruleDigitalBrickState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'DigitalBrickState' ;
    public final AntlrDatatypeRuleToken ruleDigitalBrickState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1021:28: (kw= 'DigitalBrickState' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1023:2: kw= 'DigitalBrickState'
            {
            kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDigitalBrickState2338); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDigitalBrickStateAccess().getDigitalBrickStateKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDigitalBrickState"


    // $ANTLR start "entryRuleComparison"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1036:1: entryRuleComparison returns [String current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final String entryRuleComparison() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleComparison = null;


        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1037:2: (iv_ruleComparison= ruleComparison EOF )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1038:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleComparison_in_entryRuleComparison2378);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleComparison2389); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1045:1: ruleComparison returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'Comparison' ;
    public final AntlrDatatypeRuleToken ruleComparison() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1048:28: (kw= 'Comparison' )
            // ../arduinoml.AMLX/src-gen/arduinoml/parser/antlr/internal/InternalAMLX.g:1050:2: kw= 'Comparison'
            {
            kw=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleComparison2426); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getComparisonAccess().getComparisonKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleMachine_in_entryRuleMachine75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleMachine85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleMachine122 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMachine134 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleMachine146 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleMachine169 = new BitSet(new long[]{0x0000000000024000L});
        public static final BitSet FOLLOW_14_in_ruleMachine182 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMachine194 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_ruleBrick_in_ruleMachine215 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMachine228 = new BitSet(new long[]{0x0000000001400000L});
        public static final BitSet FOLLOW_ruleBrick_in_ruleMachine249 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMachine263 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleMachine277 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleMachine289 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleState_in_ruleMachine310 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleMachine323 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_ruleState_in_ruleMachine344 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleMachine358 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleMachine370 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBrick_in_entryRuleBrick406 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBrick416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_ruleBrick463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_ruleBrick490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition525 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition535 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDigitalSensorCondition_in_ruleCondition582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeCondition_in_ruleCondition609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleState_in_entryRuleState644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleState654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_ruleState700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleState721 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState733 = new BitSet(new long[]{0x0000000000190000L});
        public static final BitSet FOLLOW_19_in_ruleState746 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState758 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState779 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleState792 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_ruleTransition_in_ruleState813 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleState827 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_20_in_ruleState842 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleState854 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleDigitalAction_in_ruleState875 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleState888 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleDigitalAction_in_ruleState909 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleState923 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleState937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString974 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString985 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1025 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1097 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleEInt1147 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1164 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSensor_in_entryRuleSensor1209 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSensor1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleSensor1256 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSensor1277 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleSensor1289 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleSensor1301 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleSensor1322 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleSensor1334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleActuator_in_entryRuleActuator1370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleActuator1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleActuator1417 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleActuator1438 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleActuator1450 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleActuator1462 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleActuator1483 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleActuator1495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1531 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTransition1541 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTransition1578 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransition1590 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTransition1602 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTransition1625 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTransition1637 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTransition1649 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleTransition1670 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleTransition1683 = new BitSet(new long[]{0x0000000280000000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleTransition1704 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleTransition1718 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTransition1730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDigitalAction_in_entryRuleDigitalAction1766 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDigitalAction1776 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleDigitalAction1813 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDigitalAction1825 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDigitalAction1837 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleDigitalBrickState_in_ruleDigitalAction1858 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_30_in_ruleDigitalAction1870 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDigitalAction1893 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDigitalAction1905 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDigitalSensorCondition_in_entryRuleDigitalSensorCondition1941 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDigitalSensorCondition1951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleDigitalSensorCondition1988 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDigitalSensorCondition2000 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleDigitalSensorCondition2012 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_ruleDigitalBrickState_in_ruleDigitalSensorCondition2033 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_32_in_ruleDigitalSensorCondition2045 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDigitalSensorCondition2068 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleDigitalSensorCondition2080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeCondition_in_entryRuleTimeCondition2116 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeCondition2126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleTimeCondition2163 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleTimeCondition2175 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleTimeCondition2187 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleTimeCondition2208 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_35_in_ruleTimeCondition2220 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_ruleComparison_in_ruleTimeCondition2241 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleTimeCondition2253 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDigitalBrickState_in_entryRuleDigitalBrickState2290 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDigitalBrickState2301 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleDigitalBrickState2338 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2378 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleComparison2389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleComparison2426 = new BitSet(new long[]{0x0000000000000002L});
    }


}