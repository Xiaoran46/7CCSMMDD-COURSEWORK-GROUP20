package uk.ac.kcl.inf.group20.docker.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import uk.ac.kcl.inf.group20.docker.services.DockerGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDockerParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'removeImg'", "'image'", "'show_all'", "'show_digests'", "'filter'", "'format'", "'complete'", "'show_ID'", "'check_different'", "'copy'", "'commit'", "'author'", "'create'", "'commit_description'", "'pause_when_commit'", "'port'", "'export'", "'wait'", "'logs'", "'track_output'", "'since'", "'show_timestamp'", "'show_tail_n_logs'", "'events'", "'until'", "'attach'", "'inspect'", "'show_size'", "'type'", "'ps'", "'show_container'", "'show_all_containers'", "'show_last_container'", "'list_last_n_containers'", "'only_show_id'", "'execute'", "'unpause'", "'pause'", "'restart'", "'stop'", "'start'", "'remove'", "'standard'", "'backstage'", "'interface'", "'random_port'", "'specify_port'", "'terminate'", "'DNS'", "'search_DNS'", "'hostname'", "'environment'", "'='", "'network'", "'name'", "'var'", "'force'", "'no_remove_process_image'", "'no_maintain_link'", "'maintain_link'", "'detach_keys'", "'no_stdin'", "'sig_proxy_true'", "'sig_proxy_false'", "'open_STDIN'", "'kill'", "'kill_sign'", "'no_option'", "'delete_link'", "'delete_volume'", "'run'", "'Ubuntu'", "'Centos'", "'Nginx'", "'PHP'", "'Apache'", "'IN'", "'OUT'", "'ERR'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

    // delegates
    // delegators


        public InternalDockerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDockerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDockerParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDocker.g"; }



     	private DockerGrammarAccess grammarAccess;

        public InternalDockerParser(TokenStream input, DockerGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected DockerGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalDocker.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalDocker.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalDocker.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalDocker.g:72:1: ruleModel returns [EObject current=null] : ( (lv_statements_0_0= ruleStatements ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:78:2: ( ( (lv_statements_0_0= ruleStatements ) )* )
            // InternalDocker.g:79:2: ( (lv_statements_0_0= ruleStatements ) )*
            {
            // InternalDocker.g:79:2: ( (lv_statements_0_0= ruleStatements ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)||(LA1_0>=19 && LA1_0<=21)||LA1_0==23||(LA1_0>=26 && LA1_0<=29)||LA1_0==34||(LA1_0>=36 && LA1_0<=37)||LA1_0==40||(LA1_0>=46 && LA1_0<=52)||LA1_0==66||(LA1_0>=76 && LA1_0<=77)||LA1_0==81) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDocker.g:80:3: (lv_statements_0_0= ruleStatements )
            	    {
            	    // InternalDocker.g:80:3: (lv_statements_0_0= ruleStatements )
            	    // InternalDocker.g:81:4: lv_statements_0_0= ruleStatements
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getStatementsStatementsParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatements();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.group20.docker.Docker.Statements");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleStatements"
    // InternalDocker.g:101:1: entryRuleStatements returns [EObject current=null] : iv_ruleStatements= ruleStatements EOF ;
    public final EObject entryRuleStatements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatements = null;


        try {
            // InternalDocker.g:101:51: (iv_ruleStatements= ruleStatements EOF )
            // InternalDocker.g:102:2: iv_ruleStatements= ruleStatements EOF
            {
             newCompositeNode(grammarAccess.getStatementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatements=ruleStatements();

            state._fsp--;

             current =iv_ruleStatements; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatements"


    // $ANTLR start "ruleStatements"
    // InternalDocker.g:108:1: ruleStatements returns [EObject current=null] : (this_RunCreateStatement_0= ruleRunCreateStatement | this_ContainerNameDeclaration_1= ruleContainerNameDeclaration | this_StartStatement_2= ruleStartStatement | this_StopStatement_3= ruleStopStatement | this_RestartStatement_4= ruleRestartStatement | this_KillStatement_5= ruleKillStatement | this_RemoveStatement_6= ruleRemoveStatement | this_PauseStatement_7= rulePauseStatement | this_UnpauseStatement_8= ruleUnpauseStatement | this_ExecStatement_9= ruleExecStatement | this_PsStatement_10= rulePsStatement | this_InspectStatement_11= ruleInspectStatement | this_AttachStatement_12= ruleAttachStatement | this_EventStatement_13= ruleEventStatement | this_LogsStatement_14= ruleLogsStatement | this_WaitStatement_15= ruleWaitStatement | this_ExportStatement_16= ruleExportStatement | this_PortStatement_17= rulePortStatement | this_CommitStatement_18= ruleCommitStatement | this_CpStatement_19= ruleCpStatement | this_DiffStatement_20= ruleDiffStatement | this_ImageStatement_21= ruleImageStatement | this_RemoveImageStatement_22= ruleRemoveImageStatement ) ;
    public final EObject ruleStatements() throws RecognitionException {
        EObject current = null;

        EObject this_RunCreateStatement_0 = null;

        EObject this_ContainerNameDeclaration_1 = null;

        EObject this_StartStatement_2 = null;

        EObject this_StopStatement_3 = null;

        EObject this_RestartStatement_4 = null;

        EObject this_KillStatement_5 = null;

        EObject this_RemoveStatement_6 = null;

        EObject this_PauseStatement_7 = null;

        EObject this_UnpauseStatement_8 = null;

        EObject this_ExecStatement_9 = null;

        EObject this_PsStatement_10 = null;

        EObject this_InspectStatement_11 = null;

        EObject this_AttachStatement_12 = null;

        EObject this_EventStatement_13 = null;

        EObject this_LogsStatement_14 = null;

        EObject this_WaitStatement_15 = null;

        EObject this_ExportStatement_16 = null;

        EObject this_PortStatement_17 = null;

        EObject this_CommitStatement_18 = null;

        EObject this_CpStatement_19 = null;

        EObject this_DiffStatement_20 = null;

        EObject this_ImageStatement_21 = null;

        EObject this_RemoveImageStatement_22 = null;



        	enterRule();

        try {
            // InternalDocker.g:114:2: ( (this_RunCreateStatement_0= ruleRunCreateStatement | this_ContainerNameDeclaration_1= ruleContainerNameDeclaration | this_StartStatement_2= ruleStartStatement | this_StopStatement_3= ruleStopStatement | this_RestartStatement_4= ruleRestartStatement | this_KillStatement_5= ruleKillStatement | this_RemoveStatement_6= ruleRemoveStatement | this_PauseStatement_7= rulePauseStatement | this_UnpauseStatement_8= ruleUnpauseStatement | this_ExecStatement_9= ruleExecStatement | this_PsStatement_10= rulePsStatement | this_InspectStatement_11= ruleInspectStatement | this_AttachStatement_12= ruleAttachStatement | this_EventStatement_13= ruleEventStatement | this_LogsStatement_14= ruleLogsStatement | this_WaitStatement_15= ruleWaitStatement | this_ExportStatement_16= ruleExportStatement | this_PortStatement_17= rulePortStatement | this_CommitStatement_18= ruleCommitStatement | this_CpStatement_19= ruleCpStatement | this_DiffStatement_20= ruleDiffStatement | this_ImageStatement_21= ruleImageStatement | this_RemoveImageStatement_22= ruleRemoveImageStatement ) )
            // InternalDocker.g:115:2: (this_RunCreateStatement_0= ruleRunCreateStatement | this_ContainerNameDeclaration_1= ruleContainerNameDeclaration | this_StartStatement_2= ruleStartStatement | this_StopStatement_3= ruleStopStatement | this_RestartStatement_4= ruleRestartStatement | this_KillStatement_5= ruleKillStatement | this_RemoveStatement_6= ruleRemoveStatement | this_PauseStatement_7= rulePauseStatement | this_UnpauseStatement_8= ruleUnpauseStatement | this_ExecStatement_9= ruleExecStatement | this_PsStatement_10= rulePsStatement | this_InspectStatement_11= ruleInspectStatement | this_AttachStatement_12= ruleAttachStatement | this_EventStatement_13= ruleEventStatement | this_LogsStatement_14= ruleLogsStatement | this_WaitStatement_15= ruleWaitStatement | this_ExportStatement_16= ruleExportStatement | this_PortStatement_17= rulePortStatement | this_CommitStatement_18= ruleCommitStatement | this_CpStatement_19= ruleCpStatement | this_DiffStatement_20= ruleDiffStatement | this_ImageStatement_21= ruleImageStatement | this_RemoveImageStatement_22= ruleRemoveImageStatement )
            {
            // InternalDocker.g:115:2: (this_RunCreateStatement_0= ruleRunCreateStatement | this_ContainerNameDeclaration_1= ruleContainerNameDeclaration | this_StartStatement_2= ruleStartStatement | this_StopStatement_3= ruleStopStatement | this_RestartStatement_4= ruleRestartStatement | this_KillStatement_5= ruleKillStatement | this_RemoveStatement_6= ruleRemoveStatement | this_PauseStatement_7= rulePauseStatement | this_UnpauseStatement_8= ruleUnpauseStatement | this_ExecStatement_9= ruleExecStatement | this_PsStatement_10= rulePsStatement | this_InspectStatement_11= ruleInspectStatement | this_AttachStatement_12= ruleAttachStatement | this_EventStatement_13= ruleEventStatement | this_LogsStatement_14= ruleLogsStatement | this_WaitStatement_15= ruleWaitStatement | this_ExportStatement_16= ruleExportStatement | this_PortStatement_17= rulePortStatement | this_CommitStatement_18= ruleCommitStatement | this_CpStatement_19= ruleCpStatement | this_DiffStatement_20= ruleDiffStatement | this_ImageStatement_21= ruleImageStatement | this_RemoveImageStatement_22= ruleRemoveImageStatement )
            int alt2=23;
            switch ( input.LA(1) ) {
            case 23:
            case 81:
                {
                alt2=1;
                }
                break;
            case 66:
                {
                alt2=2;
                }
                break;
            case 51:
                {
                alt2=3;
                }
                break;
            case 50:
                {
                alt2=4;
                }
                break;
            case 49:
                {
                alt2=5;
                }
                break;
            case 76:
            case 77:
                {
                alt2=6;
                }
                break;
            case 52:
                {
                alt2=7;
                }
                break;
            case 48:
                {
                alt2=8;
                }
                break;
            case 47:
                {
                alt2=9;
                }
                break;
            case 46:
                {
                alt2=10;
                }
                break;
            case 40:
                {
                alt2=11;
                }
                break;
            case 37:
                {
                alt2=12;
                }
                break;
            case 36:
                {
                alt2=13;
                }
                break;
            case 34:
                {
                alt2=14;
                }
                break;
            case 29:
                {
                alt2=15;
                }
                break;
            case 28:
                {
                alt2=16;
                }
                break;
            case 27:
                {
                alt2=17;
                }
                break;
            case 26:
                {
                alt2=18;
                }
                break;
            case 21:
                {
                alt2=19;
                }
                break;
            case 20:
                {
                alt2=20;
                }
                break;
            case 19:
                {
                alt2=21;
                }
                break;
            case 12:
                {
                alt2=22;
                }
                break;
            case 11:
                {
                alt2=23;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDocker.g:116:3: this_RunCreateStatement_0= ruleRunCreateStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getRunCreateStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_RunCreateStatement_0=ruleRunCreateStatement();

                    state._fsp--;


                    			current = this_RunCreateStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalDocker.g:125:3: this_ContainerNameDeclaration_1= ruleContainerNameDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getContainerNameDeclarationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContainerNameDeclaration_1=ruleContainerNameDeclaration();

                    state._fsp--;


                    			current = this_ContainerNameDeclaration_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalDocker.g:134:3: this_StartStatement_2= ruleStartStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getStartStatementParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_StartStatement_2=ruleStartStatement();

                    state._fsp--;


                    			current = this_StartStatement_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalDocker.g:143:3: this_StopStatement_3= ruleStopStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getStopStatementParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StopStatement_3=ruleStopStatement();

                    state._fsp--;


                    			current = this_StopStatement_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalDocker.g:152:3: this_RestartStatement_4= ruleRestartStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getRestartStatementParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_RestartStatement_4=ruleRestartStatement();

                    state._fsp--;


                    			current = this_RestartStatement_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalDocker.g:161:3: this_KillStatement_5= ruleKillStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getKillStatementParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_KillStatement_5=ruleKillStatement();

                    state._fsp--;


                    			current = this_KillStatement_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalDocker.g:170:3: this_RemoveStatement_6= ruleRemoveStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getRemoveStatementParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveStatement_6=ruleRemoveStatement();

                    state._fsp--;


                    			current = this_RemoveStatement_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalDocker.g:179:3: this_PauseStatement_7= rulePauseStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getPauseStatementParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_PauseStatement_7=rulePauseStatement();

                    state._fsp--;


                    			current = this_PauseStatement_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalDocker.g:188:3: this_UnpauseStatement_8= ruleUnpauseStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getUnpauseStatementParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_UnpauseStatement_8=ruleUnpauseStatement();

                    state._fsp--;


                    			current = this_UnpauseStatement_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalDocker.g:197:3: this_ExecStatement_9= ruleExecStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getExecStatementParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExecStatement_9=ruleExecStatement();

                    state._fsp--;


                    			current = this_ExecStatement_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalDocker.g:206:3: this_PsStatement_10= rulePsStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getPsStatementParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_PsStatement_10=rulePsStatement();

                    state._fsp--;


                    			current = this_PsStatement_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalDocker.g:215:3: this_InspectStatement_11= ruleInspectStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getInspectStatementParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_InspectStatement_11=ruleInspectStatement();

                    state._fsp--;


                    			current = this_InspectStatement_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalDocker.g:224:3: this_AttachStatement_12= ruleAttachStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getAttachStatementParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_AttachStatement_12=ruleAttachStatement();

                    state._fsp--;


                    			current = this_AttachStatement_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalDocker.g:233:3: this_EventStatement_13= ruleEventStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getEventStatementParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_EventStatement_13=ruleEventStatement();

                    state._fsp--;


                    			current = this_EventStatement_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalDocker.g:242:3: this_LogsStatement_14= ruleLogsStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getLogsStatementParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_LogsStatement_14=ruleLogsStatement();

                    state._fsp--;


                    			current = this_LogsStatement_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalDocker.g:251:3: this_WaitStatement_15= ruleWaitStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getWaitStatementParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_WaitStatement_15=ruleWaitStatement();

                    state._fsp--;


                    			current = this_WaitStatement_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalDocker.g:260:3: this_ExportStatement_16= ruleExportStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getExportStatementParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExportStatement_16=ruleExportStatement();

                    state._fsp--;


                    			current = this_ExportStatement_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalDocker.g:269:3: this_PortStatement_17= rulePortStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getPortStatementParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_PortStatement_17=rulePortStatement();

                    state._fsp--;


                    			current = this_PortStatement_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalDocker.g:278:3: this_CommitStatement_18= ruleCommitStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getCommitStatementParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_CommitStatement_18=ruleCommitStatement();

                    state._fsp--;


                    			current = this_CommitStatement_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalDocker.g:287:3: this_CpStatement_19= ruleCpStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getCpStatementParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_CpStatement_19=ruleCpStatement();

                    state._fsp--;


                    			current = this_CpStatement_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalDocker.g:296:3: this_DiffStatement_20= ruleDiffStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getDiffStatementParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_DiffStatement_20=ruleDiffStatement();

                    state._fsp--;


                    			current = this_DiffStatement_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalDocker.g:305:3: this_ImageStatement_21= ruleImageStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getImageStatementParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_ImageStatement_21=ruleImageStatement();

                    state._fsp--;


                    			current = this_ImageStatement_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalDocker.g:314:3: this_RemoveImageStatement_22= ruleRemoveImageStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementsAccess().getRemoveImageStatementParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_RemoveImageStatement_22=ruleRemoveImageStatement();

                    state._fsp--;


                    			current = this_RemoveImageStatement_22;
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
    // $ANTLR end "ruleStatements"


    // $ANTLR start "entryRuleRemoveImageStatement"
    // InternalDocker.g:326:1: entryRuleRemoveImageStatement returns [EObject current=null] : iv_ruleRemoveImageStatement= ruleRemoveImageStatement EOF ;
    public final EObject entryRuleRemoveImageStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveImageStatement = null;


        try {
            // InternalDocker.g:326:61: (iv_ruleRemoveImageStatement= ruleRemoveImageStatement EOF )
            // InternalDocker.g:327:2: iv_ruleRemoveImageStatement= ruleRemoveImageStatement EOF
            {
             newCompositeNode(grammarAccess.getRemoveImageStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveImageStatement=ruleRemoveImageStatement();

            state._fsp--;

             current =iv_ruleRemoveImageStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRemoveImageStatement"


    // $ANTLR start "ruleRemoveImageStatement"
    // InternalDocker.g:333:1: ruleRemoveImageStatement returns [EObject current=null] : (otherlv_0= 'removeImg' ( (lv_removeimageOptions_1_0= ruleRemoveImageOptions ) )* ( (lv_image_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRemoveImageStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_image_2_0=null;
        Enumerator lv_removeimageOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:339:2: ( (otherlv_0= 'removeImg' ( (lv_removeimageOptions_1_0= ruleRemoveImageOptions ) )* ( (lv_image_2_0= RULE_STRING ) ) ) )
            // InternalDocker.g:340:2: (otherlv_0= 'removeImg' ( (lv_removeimageOptions_1_0= ruleRemoveImageOptions ) )* ( (lv_image_2_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:340:2: (otherlv_0= 'removeImg' ( (lv_removeimageOptions_1_0= ruleRemoveImageOptions ) )* ( (lv_image_2_0= RULE_STRING ) ) )
            // InternalDocker.g:341:3: otherlv_0= 'removeImg' ( (lv_removeimageOptions_1_0= ruleRemoveImageOptions ) )* ( (lv_image_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveImageStatementAccess().getRemoveImgKeyword_0());
            		
            // InternalDocker.g:345:3: ( (lv_removeimageOptions_1_0= ruleRemoveImageOptions ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=67 && LA3_0<=68)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalDocker.g:346:4: (lv_removeimageOptions_1_0= ruleRemoveImageOptions )
            	    {
            	    // InternalDocker.g:346:4: (lv_removeimageOptions_1_0= ruleRemoveImageOptions )
            	    // InternalDocker.g:347:5: lv_removeimageOptions_1_0= ruleRemoveImageOptions
            	    {

            	    					newCompositeNode(grammarAccess.getRemoveImageStatementAccess().getRemoveimageOptionsRemoveImageOptionsEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_removeimageOptions_1_0=ruleRemoveImageOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRemoveImageStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"removeimageOptions",
            	    						lv_removeimageOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.RemoveImageOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalDocker.g:364:3: ( (lv_image_2_0= RULE_STRING ) )
            // InternalDocker.g:365:4: (lv_image_2_0= RULE_STRING )
            {
            // InternalDocker.g:365:4: (lv_image_2_0= RULE_STRING )
            // InternalDocker.g:366:5: lv_image_2_0= RULE_STRING
            {
            lv_image_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_image_2_0, grammarAccess.getRemoveImageStatementAccess().getImageSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveImageStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"image",
            						lv_image_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleRemoveImageStatement"


    // $ANTLR start "entryRuleImageStatement"
    // InternalDocker.g:386:1: entryRuleImageStatement returns [EObject current=null] : iv_ruleImageStatement= ruleImageStatement EOF ;
    public final EObject entryRuleImageStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageStatement = null;


        try {
            // InternalDocker.g:386:55: (iv_ruleImageStatement= ruleImageStatement EOF )
            // InternalDocker.g:387:2: iv_ruleImageStatement= ruleImageStatement EOF
            {
             newCompositeNode(grammarAccess.getImageStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageStatement=ruleImageStatement();

            state._fsp--;

             current =iv_ruleImageStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImageStatement"


    // $ANTLR start "ruleImageStatement"
    // InternalDocker.g:393:1: ruleImageStatement returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageOptions_1_0= ruleImageOptions ) )* ( (lv_repository_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleImageStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_repository_2_0=null;
        EObject lv_imageOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:399:2: ( (otherlv_0= 'image' ( (lv_imageOptions_1_0= ruleImageOptions ) )* ( (lv_repository_2_0= RULE_STRING ) ) ) )
            // InternalDocker.g:400:2: (otherlv_0= 'image' ( (lv_imageOptions_1_0= ruleImageOptions ) )* ( (lv_repository_2_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:400:2: (otherlv_0= 'image' ( (lv_imageOptions_1_0= ruleImageOptions ) )* ( (lv_repository_2_0= RULE_STRING ) ) )
            // InternalDocker.g:401:3: otherlv_0= 'image' ( (lv_imageOptions_1_0= ruleImageOptions ) )* ( (lv_repository_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getImageStatementAccess().getImageKeyword_0());
            		
            // InternalDocker.g:405:3: ( (lv_imageOptions_1_0= ruleImageOptions ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=13 && LA4_0<=18)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDocker.g:406:4: (lv_imageOptions_1_0= ruleImageOptions )
            	    {
            	    // InternalDocker.g:406:4: (lv_imageOptions_1_0= ruleImageOptions )
            	    // InternalDocker.g:407:5: lv_imageOptions_1_0= ruleImageOptions
            	    {

            	    					newCompositeNode(grammarAccess.getImageStatementAccess().getImageOptionsImageOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_imageOptions_1_0=ruleImageOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getImageStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imageOptions",
            	    						lv_imageOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.ImageOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalDocker.g:424:3: ( (lv_repository_2_0= RULE_STRING ) )
            // InternalDocker.g:425:4: (lv_repository_2_0= RULE_STRING )
            {
            // InternalDocker.g:425:4: (lv_repository_2_0= RULE_STRING )
            // InternalDocker.g:426:5: lv_repository_2_0= RULE_STRING
            {
            lv_repository_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_repository_2_0, grammarAccess.getImageStatementAccess().getRepositorySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repository",
            						lv_repository_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleImageStatement"


    // $ANTLR start "entryRuleImageOptions"
    // InternalDocker.g:446:1: entryRuleImageOptions returns [EObject current=null] : iv_ruleImageOptions= ruleImageOptions EOF ;
    public final EObject entryRuleImageOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageOptions = null;


        try {
            // InternalDocker.g:446:53: (iv_ruleImageOptions= ruleImageOptions EOF )
            // InternalDocker.g:447:2: iv_ruleImageOptions= ruleImageOptions EOF
            {
             newCompositeNode(grammarAccess.getImageOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageOptions=ruleImageOptions();

            state._fsp--;

             current =iv_ruleImageOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImageOptions"


    // $ANTLR start "ruleImageOptions"
    // InternalDocker.g:453:1: ruleImageOptions returns [EObject current=null] : ( ( () ( (lv_option_1_0= 'show_all' ) ) ) | ( () ( (lv_option_3_0= 'show_digests' ) ) ) | ( ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) ) ) | ( ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) ) ) | ( () ( (lv_option_9_0= 'complete' ) ) ) | ( () ( (lv_option_11_0= 'show_ID' ) ) ) ) ;
    public final EObject ruleImageOptions() throws RecognitionException {
        EObject current = null;

        Token lv_option_1_0=null;
        Token lv_option_3_0=null;
        Token lv_option_4_0=null;
        Token lv_condition_5_0=null;
        Token lv_option_6_0=null;
        Token lv_formats_7_0=null;
        Token lv_option_9_0=null;
        Token lv_option_11_0=null;


        	enterRule();

        try {
            // InternalDocker.g:459:2: ( ( ( () ( (lv_option_1_0= 'show_all' ) ) ) | ( () ( (lv_option_3_0= 'show_digests' ) ) ) | ( ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) ) ) | ( ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) ) ) | ( () ( (lv_option_9_0= 'complete' ) ) ) | ( () ( (lv_option_11_0= 'show_ID' ) ) ) ) )
            // InternalDocker.g:460:2: ( ( () ( (lv_option_1_0= 'show_all' ) ) ) | ( () ( (lv_option_3_0= 'show_digests' ) ) ) | ( ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) ) ) | ( ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) ) ) | ( () ( (lv_option_9_0= 'complete' ) ) ) | ( () ( (lv_option_11_0= 'show_ID' ) ) ) )
            {
            // InternalDocker.g:460:2: ( ( () ( (lv_option_1_0= 'show_all' ) ) ) | ( () ( (lv_option_3_0= 'show_digests' ) ) ) | ( ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) ) ) | ( ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) ) ) | ( () ( (lv_option_9_0= 'complete' ) ) ) | ( () ( (lv_option_11_0= 'show_ID' ) ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDocker.g:461:3: ( () ( (lv_option_1_0= 'show_all' ) ) )
                    {
                    // InternalDocker.g:461:3: ( () ( (lv_option_1_0= 'show_all' ) ) )
                    // InternalDocker.g:462:4: () ( (lv_option_1_0= 'show_all' ) )
                    {
                    // InternalDocker.g:462:4: ()
                    // InternalDocker.g:463:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getImageOptionsAccess().getImageOptionsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:469:4: ( (lv_option_1_0= 'show_all' ) )
                    // InternalDocker.g:470:5: (lv_option_1_0= 'show_all' )
                    {
                    // InternalDocker.g:470:5: (lv_option_1_0= 'show_all' )
                    // InternalDocker.g:471:6: lv_option_1_0= 'show_all'
                    {
                    lv_option_1_0=(Token)match(input,13,FOLLOW_2); 

                    						newLeafNode(lv_option_1_0, grammarAccess.getImageOptionsAccess().getOptionShow_allKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_1_0, "show_all");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:485:3: ( () ( (lv_option_3_0= 'show_digests' ) ) )
                    {
                    // InternalDocker.g:485:3: ( () ( (lv_option_3_0= 'show_digests' ) ) )
                    // InternalDocker.g:486:4: () ( (lv_option_3_0= 'show_digests' ) )
                    {
                    // InternalDocker.g:486:4: ()
                    // InternalDocker.g:487:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getImageOptionsAccess().getImageOptionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:493:4: ( (lv_option_3_0= 'show_digests' ) )
                    // InternalDocker.g:494:5: (lv_option_3_0= 'show_digests' )
                    {
                    // InternalDocker.g:494:5: (lv_option_3_0= 'show_digests' )
                    // InternalDocker.g:495:6: lv_option_3_0= 'show_digests'
                    {
                    lv_option_3_0=(Token)match(input,14,FOLLOW_2); 

                    						newLeafNode(lv_option_3_0, grammarAccess.getImageOptionsAccess().getOptionShow_digestsKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_3_0, "show_digests");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:509:3: ( ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:509:3: ( ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) ) )
                    // InternalDocker.g:510:4: ( (lv_option_4_0= 'filter' ) ) ( (lv_condition_5_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:510:4: ( (lv_option_4_0= 'filter' ) )
                    // InternalDocker.g:511:5: (lv_option_4_0= 'filter' )
                    {
                    // InternalDocker.g:511:5: (lv_option_4_0= 'filter' )
                    // InternalDocker.g:512:6: lv_option_4_0= 'filter'
                    {
                    lv_option_4_0=(Token)match(input,15,FOLLOW_6); 

                    						newLeafNode(lv_option_4_0, grammarAccess.getImageOptionsAccess().getOptionFilterKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_4_0, "filter");
                    					

                    }


                    }

                    // InternalDocker.g:524:4: ( (lv_condition_5_0= RULE_STRING ) )
                    // InternalDocker.g:525:5: (lv_condition_5_0= RULE_STRING )
                    {
                    // InternalDocker.g:525:5: (lv_condition_5_0= RULE_STRING )
                    // InternalDocker.g:526:6: lv_condition_5_0= RULE_STRING
                    {
                    lv_condition_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_condition_5_0, grammarAccess.getImageOptionsAccess().getConditionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"condition",
                    							lv_condition_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:544:3: ( ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:544:3: ( ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) ) )
                    // InternalDocker.g:545:4: ( (lv_option_6_0= 'format' ) ) ( (lv_formats_7_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:545:4: ( (lv_option_6_0= 'format' ) )
                    // InternalDocker.g:546:5: (lv_option_6_0= 'format' )
                    {
                    // InternalDocker.g:546:5: (lv_option_6_0= 'format' )
                    // InternalDocker.g:547:6: lv_option_6_0= 'format'
                    {
                    lv_option_6_0=(Token)match(input,16,FOLLOW_6); 

                    						newLeafNode(lv_option_6_0, grammarAccess.getImageOptionsAccess().getOptionFormatKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_6_0, "format");
                    					

                    }


                    }

                    // InternalDocker.g:559:4: ( (lv_formats_7_0= RULE_STRING ) )
                    // InternalDocker.g:560:5: (lv_formats_7_0= RULE_STRING )
                    {
                    // InternalDocker.g:560:5: (lv_formats_7_0= RULE_STRING )
                    // InternalDocker.g:561:6: lv_formats_7_0= RULE_STRING
                    {
                    lv_formats_7_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_formats_7_0, grammarAccess.getImageOptionsAccess().getFormatsSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"formats",
                    							lv_formats_7_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDocker.g:579:3: ( () ( (lv_option_9_0= 'complete' ) ) )
                    {
                    // InternalDocker.g:579:3: ( () ( (lv_option_9_0= 'complete' ) ) )
                    // InternalDocker.g:580:4: () ( (lv_option_9_0= 'complete' ) )
                    {
                    // InternalDocker.g:580:4: ()
                    // InternalDocker.g:581:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getImageOptionsAccess().getImageOptionsAction_4_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:587:4: ( (lv_option_9_0= 'complete' ) )
                    // InternalDocker.g:588:5: (lv_option_9_0= 'complete' )
                    {
                    // InternalDocker.g:588:5: (lv_option_9_0= 'complete' )
                    // InternalDocker.g:589:6: lv_option_9_0= 'complete'
                    {
                    lv_option_9_0=(Token)match(input,17,FOLLOW_2); 

                    						newLeafNode(lv_option_9_0, grammarAccess.getImageOptionsAccess().getOptionCompleteKeyword_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_9_0, "complete");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDocker.g:603:3: ( () ( (lv_option_11_0= 'show_ID' ) ) )
                    {
                    // InternalDocker.g:603:3: ( () ( (lv_option_11_0= 'show_ID' ) ) )
                    // InternalDocker.g:604:4: () ( (lv_option_11_0= 'show_ID' ) )
                    {
                    // InternalDocker.g:604:4: ()
                    // InternalDocker.g:605:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getImageOptionsAccess().getImageOptionsAction_5_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:611:4: ( (lv_option_11_0= 'show_ID' ) )
                    // InternalDocker.g:612:5: (lv_option_11_0= 'show_ID' )
                    {
                    // InternalDocker.g:612:5: (lv_option_11_0= 'show_ID' )
                    // InternalDocker.g:613:6: lv_option_11_0= 'show_ID'
                    {
                    lv_option_11_0=(Token)match(input,18,FOLLOW_2); 

                    						newLeafNode(lv_option_11_0, grammarAccess.getImageOptionsAccess().getOptionShow_IDKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImageOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_11_0, "show_ID");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleImageOptions"


    // $ANTLR start "entryRuleDiffStatement"
    // InternalDocker.g:630:1: entryRuleDiffStatement returns [EObject current=null] : iv_ruleDiffStatement= ruleDiffStatement EOF ;
    public final EObject entryRuleDiffStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiffStatement = null;


        try {
            // InternalDocker.g:630:54: (iv_ruleDiffStatement= ruleDiffStatement EOF )
            // InternalDocker.g:631:2: iv_ruleDiffStatement= ruleDiffStatement EOF
            {
             newCompositeNode(grammarAccess.getDiffStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiffStatement=ruleDiffStatement();

            state._fsp--;

             current =iv_ruleDiffStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDiffStatement"


    // $ANTLR start "ruleDiffStatement"
    // InternalDocker.g:637:1: ruleDiffStatement returns [EObject current=null] : (otherlv_0= 'check_different' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDiffStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:643:2: ( (otherlv_0= 'check_different' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:644:2: (otherlv_0= 'check_different' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:644:2: (otherlv_0= 'check_different' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:645:3: otherlv_0= 'check_different' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getDiffStatementAccess().getCheck_differentKeyword_0());
            		
            // InternalDocker.g:649:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:650:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:650:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:651:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiffStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getDiffStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleDiffStatement"


    // $ANTLR start "entryRuleCpStatement"
    // InternalDocker.g:666:1: entryRuleCpStatement returns [EObject current=null] : iv_ruleCpStatement= ruleCpStatement EOF ;
    public final EObject entryRuleCpStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCpStatement = null;


        try {
            // InternalDocker.g:666:52: (iv_ruleCpStatement= ruleCpStatement EOF )
            // InternalDocker.g:667:2: iv_ruleCpStatement= ruleCpStatement EOF
            {
             newCompositeNode(grammarAccess.getCpStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCpStatement=ruleCpStatement();

            state._fsp--;

             current =iv_ruleCpStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCpStatement"


    // $ANTLR start "ruleCpStatement"
    // InternalDocker.g:673:1: ruleCpStatement returns [EObject current=null] : (otherlv_0= 'copy' ( (lv_link_1_0= ruleLinkOption ) ) ( (lv_source_2_0= ruleSourceOption ) ) ( (lv_destination_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCpStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_destination_3_0=null;
        Enumerator lv_link_1_0 = null;

        EObject lv_source_2_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:679:2: ( (otherlv_0= 'copy' ( (lv_link_1_0= ruleLinkOption ) ) ( (lv_source_2_0= ruleSourceOption ) ) ( (lv_destination_3_0= RULE_STRING ) ) ) )
            // InternalDocker.g:680:2: (otherlv_0= 'copy' ( (lv_link_1_0= ruleLinkOption ) ) ( (lv_source_2_0= ruleSourceOption ) ) ( (lv_destination_3_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:680:2: (otherlv_0= 'copy' ( (lv_link_1_0= ruleLinkOption ) ) ( (lv_source_2_0= ruleSourceOption ) ) ( (lv_destination_3_0= RULE_STRING ) ) )
            // InternalDocker.g:681:3: otherlv_0= 'copy' ( (lv_link_1_0= ruleLinkOption ) ) ( (lv_source_2_0= ruleSourceOption ) ) ( (lv_destination_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCpStatementAccess().getCopyKeyword_0());
            		
            // InternalDocker.g:685:3: ( (lv_link_1_0= ruleLinkOption ) )
            // InternalDocker.g:686:4: (lv_link_1_0= ruleLinkOption )
            {
            // InternalDocker.g:686:4: (lv_link_1_0= ruleLinkOption )
            // InternalDocker.g:687:5: lv_link_1_0= ruleLinkOption
            {

            					newCompositeNode(grammarAccess.getCpStatementAccess().getLinkLinkOptionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_link_1_0=ruleLinkOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCpStatementRule());
            					}
            					set(
            						current,
            						"link",
            						lv_link_1_0,
            						"uk.ac.kcl.inf.group20.docker.Docker.LinkOption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDocker.g:704:3: ( (lv_source_2_0= ruleSourceOption ) )
            // InternalDocker.g:705:4: (lv_source_2_0= ruleSourceOption )
            {
            // InternalDocker.g:705:4: (lv_source_2_0= ruleSourceOption )
            // InternalDocker.g:706:5: lv_source_2_0= ruleSourceOption
            {

            					newCompositeNode(grammarAccess.getCpStatementAccess().getSourceSourceOptionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_source_2_0=ruleSourceOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCpStatementRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_2_0,
            						"uk.ac.kcl.inf.group20.docker.Docker.SourceOption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDocker.g:723:3: ( (lv_destination_3_0= RULE_STRING ) )
            // InternalDocker.g:724:4: (lv_destination_3_0= RULE_STRING )
            {
            // InternalDocker.g:724:4: (lv_destination_3_0= RULE_STRING )
            // InternalDocker.g:725:5: lv_destination_3_0= RULE_STRING
            {
            lv_destination_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_destination_3_0, grammarAccess.getCpStatementAccess().getDestinationSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCpStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"destination",
            						lv_destination_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleCpStatement"


    // $ANTLR start "entryRuleSourceOption"
    // InternalDocker.g:745:1: entryRuleSourceOption returns [EObject current=null] : iv_ruleSourceOption= ruleSourceOption EOF ;
    public final EObject entryRuleSourceOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSourceOption = null;


        try {
            // InternalDocker.g:745:53: (iv_ruleSourceOption= ruleSourceOption EOF )
            // InternalDocker.g:746:2: iv_ruleSourceOption= ruleSourceOption EOF
            {
             newCompositeNode(grammarAccess.getSourceOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSourceOption=ruleSourceOption();

            state._fsp--;

             current =iv_ruleSourceOption; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSourceOption"


    // $ANTLR start "ruleSourceOption"
    // InternalDocker.g:752:1: ruleSourceOption returns [EObject current=null] : ( ( (lv_option1_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleSourceOption() throws RecognitionException {
        EObject current = null;

        Token lv_option1_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:758:2: ( ( ( (lv_option1_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:759:2: ( ( (lv_option1_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:759:2: ( ( (lv_option1_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalDocker.g:760:3: ( (lv_option1_0_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:760:3: ( (lv_option1_0_0= RULE_STRING ) )
                    // InternalDocker.g:761:4: (lv_option1_0_0= RULE_STRING )
                    {
                    // InternalDocker.g:761:4: (lv_option1_0_0= RULE_STRING )
                    // InternalDocker.g:762:5: lv_option1_0_0= RULE_STRING
                    {
                    lv_option1_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_option1_0_0, grammarAccess.getSourceOptionAccess().getOption1STRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceOptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"option1",
                    						lv_option1_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:779:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalDocker.g:779:3: ( (otherlv_1= RULE_ID ) )
                    // InternalDocker.g:780:4: (otherlv_1= RULE_ID )
                    {
                    // InternalDocker.g:780:4: (otherlv_1= RULE_ID )
                    // InternalDocker.g:781:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSourceOptionRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getSourceOptionAccess().getOption2ContainerNameDeclarationCrossReference_1_0());
                    				

                    }


                    }


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
    // $ANTLR end "ruleSourceOption"


    // $ANTLR start "entryRuleCommitStatement"
    // InternalDocker.g:796:1: entryRuleCommitStatement returns [EObject current=null] : iv_ruleCommitStatement= ruleCommitStatement EOF ;
    public final EObject entryRuleCommitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommitStatement = null;


        try {
            // InternalDocker.g:796:56: (iv_ruleCommitStatement= ruleCommitStatement EOF )
            // InternalDocker.g:797:2: iv_ruleCommitStatement= ruleCommitStatement EOF
            {
             newCompositeNode(grammarAccess.getCommitStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommitStatement=ruleCommitStatement();

            state._fsp--;

             current =iv_ruleCommitStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommitStatement"


    // $ANTLR start "ruleCommitStatement"
    // InternalDocker.g:803:1: ruleCommitStatement returns [EObject current=null] : (otherlv_0= 'commit' ( (lv_commitOptions_1_0= ruleCommitOptions ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_repository_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleCommitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_repository_3_0=null;
        EObject lv_commitOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:809:2: ( (otherlv_0= 'commit' ( (lv_commitOptions_1_0= ruleCommitOptions ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_repository_3_0= RULE_STRING ) ) ) )
            // InternalDocker.g:810:2: (otherlv_0= 'commit' ( (lv_commitOptions_1_0= ruleCommitOptions ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_repository_3_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:810:2: (otherlv_0= 'commit' ( (lv_commitOptions_1_0= ruleCommitOptions ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_repository_3_0= RULE_STRING ) ) )
            // InternalDocker.g:811:3: otherlv_0= 'commit' ( (lv_commitOptions_1_0= ruleCommitOptions ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_repository_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCommitStatementAccess().getCommitKeyword_0());
            		
            // InternalDocker.g:815:3: ( (lv_commitOptions_1_0= ruleCommitOptions ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=22 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDocker.g:816:4: (lv_commitOptions_1_0= ruleCommitOptions )
            	    {
            	    // InternalDocker.g:816:4: (lv_commitOptions_1_0= ruleCommitOptions )
            	    // InternalDocker.g:817:5: lv_commitOptions_1_0= ruleCommitOptions
            	    {

            	    					newCompositeNode(grammarAccess.getCommitStatementAccess().getCommitOptionsCommitOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_commitOptions_1_0=ruleCommitOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCommitStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"commitOptions",
            	    						lv_commitOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.CommitOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalDocker.g:834:3: ( (otherlv_2= RULE_ID ) )
            // InternalDocker.g:835:4: (otherlv_2= RULE_ID )
            {
            // InternalDocker.g:835:4: (otherlv_2= RULE_ID )
            // InternalDocker.g:836:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommitStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getCommitStatementAccess().getContainerNameContainerNameDeclarationCrossReference_2_0());
            				

            }


            }

            // InternalDocker.g:847:3: ( (lv_repository_3_0= RULE_STRING ) )
            // InternalDocker.g:848:4: (lv_repository_3_0= RULE_STRING )
            {
            // InternalDocker.g:848:4: (lv_repository_3_0= RULE_STRING )
            // InternalDocker.g:849:5: lv_repository_3_0= RULE_STRING
            {
            lv_repository_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_repository_3_0, grammarAccess.getCommitStatementAccess().getRepositorySTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCommitStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"repository",
            						lv_repository_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleCommitStatement"


    // $ANTLR start "entryRuleCommitOptions"
    // InternalDocker.g:869:1: entryRuleCommitOptions returns [EObject current=null] : iv_ruleCommitOptions= ruleCommitOptions EOF ;
    public final EObject entryRuleCommitOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommitOptions = null;


        try {
            // InternalDocker.g:869:54: (iv_ruleCommitOptions= ruleCommitOptions EOF )
            // InternalDocker.g:870:2: iv_ruleCommitOptions= ruleCommitOptions EOF
            {
             newCompositeNode(grammarAccess.getCommitOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCommitOptions=ruleCommitOptions();

            state._fsp--;

             current =iv_ruleCommitOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCommitOptions"


    // $ANTLR start "ruleCommitOptions"
    // InternalDocker.g:876:1: ruleCommitOptions returns [EObject current=null] : ( ( ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) ) ) | ( () ( (lv_option_3_0= 'create' ) ) ) | ( ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) ) ) | ( () ( (lv_option_7_0= 'pause_when_commit' ) ) ) ) ;
    public final EObject ruleCommitOptions() throws RecognitionException {
        EObject current = null;

        Token lv_option_0_0=null;
        Token lv_author_1_0=null;
        Token lv_option_3_0=null;
        Token lv_option_4_0=null;
        Token lv_description_5_0=null;
        Token lv_option_7_0=null;


        	enterRule();

        try {
            // InternalDocker.g:882:2: ( ( ( ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) ) ) | ( () ( (lv_option_3_0= 'create' ) ) ) | ( ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) ) ) | ( () ( (lv_option_7_0= 'pause_when_commit' ) ) ) ) )
            // InternalDocker.g:883:2: ( ( ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) ) ) | ( () ( (lv_option_3_0= 'create' ) ) ) | ( ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) ) ) | ( () ( (lv_option_7_0= 'pause_when_commit' ) ) ) )
            {
            // InternalDocker.g:883:2: ( ( ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) ) ) | ( () ( (lv_option_3_0= 'create' ) ) ) | ( ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) ) ) | ( () ( (lv_option_7_0= 'pause_when_commit' ) ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            case 25:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDocker.g:884:3: ( ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:884:3: ( ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) ) )
                    // InternalDocker.g:885:4: ( (lv_option_0_0= 'author' ) ) ( (lv_author_1_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:885:4: ( (lv_option_0_0= 'author' ) )
                    // InternalDocker.g:886:5: (lv_option_0_0= 'author' )
                    {
                    // InternalDocker.g:886:5: (lv_option_0_0= 'author' )
                    // InternalDocker.g:887:6: lv_option_0_0= 'author'
                    {
                    lv_option_0_0=(Token)match(input,22,FOLLOW_6); 

                    						newLeafNode(lv_option_0_0, grammarAccess.getCommitOptionsAccess().getOptionAuthorKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommitOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_0_0, "author");
                    					

                    }


                    }

                    // InternalDocker.g:899:4: ( (lv_author_1_0= RULE_STRING ) )
                    // InternalDocker.g:900:5: (lv_author_1_0= RULE_STRING )
                    {
                    // InternalDocker.g:900:5: (lv_author_1_0= RULE_STRING )
                    // InternalDocker.g:901:6: lv_author_1_0= RULE_STRING
                    {
                    lv_author_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_author_1_0, grammarAccess.getCommitOptionsAccess().getAuthorSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommitOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"author",
                    							lv_author_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:919:3: ( () ( (lv_option_3_0= 'create' ) ) )
                    {
                    // InternalDocker.g:919:3: ( () ( (lv_option_3_0= 'create' ) ) )
                    // InternalDocker.g:920:4: () ( (lv_option_3_0= 'create' ) )
                    {
                    // InternalDocker.g:920:4: ()
                    // InternalDocker.g:921:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommitOptionsAccess().getCommitOptionsAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:927:4: ( (lv_option_3_0= 'create' ) )
                    // InternalDocker.g:928:5: (lv_option_3_0= 'create' )
                    {
                    // InternalDocker.g:928:5: (lv_option_3_0= 'create' )
                    // InternalDocker.g:929:6: lv_option_3_0= 'create'
                    {
                    lv_option_3_0=(Token)match(input,23,FOLLOW_2); 

                    						newLeafNode(lv_option_3_0, grammarAccess.getCommitOptionsAccess().getOptionCreateKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommitOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_3_0, "create");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:943:3: ( ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:943:3: ( ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) ) )
                    // InternalDocker.g:944:4: ( (lv_option_4_0= 'commit_description' ) ) ( (lv_description_5_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:944:4: ( (lv_option_4_0= 'commit_description' ) )
                    // InternalDocker.g:945:5: (lv_option_4_0= 'commit_description' )
                    {
                    // InternalDocker.g:945:5: (lv_option_4_0= 'commit_description' )
                    // InternalDocker.g:946:6: lv_option_4_0= 'commit_description'
                    {
                    lv_option_4_0=(Token)match(input,24,FOLLOW_6); 

                    						newLeafNode(lv_option_4_0, grammarAccess.getCommitOptionsAccess().getOptionCommit_descriptionKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommitOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_4_0, "commit_description");
                    					

                    }


                    }

                    // InternalDocker.g:958:4: ( (lv_description_5_0= RULE_STRING ) )
                    // InternalDocker.g:959:5: (lv_description_5_0= RULE_STRING )
                    {
                    // InternalDocker.g:959:5: (lv_description_5_0= RULE_STRING )
                    // InternalDocker.g:960:6: lv_description_5_0= RULE_STRING
                    {
                    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_description_5_0, grammarAccess.getCommitOptionsAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommitOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:978:3: ( () ( (lv_option_7_0= 'pause_when_commit' ) ) )
                    {
                    // InternalDocker.g:978:3: ( () ( (lv_option_7_0= 'pause_when_commit' ) ) )
                    // InternalDocker.g:979:4: () ( (lv_option_7_0= 'pause_when_commit' ) )
                    {
                    // InternalDocker.g:979:4: ()
                    // InternalDocker.g:980:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getCommitOptionsAccess().getCommitOptionsAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:986:4: ( (lv_option_7_0= 'pause_when_commit' ) )
                    // InternalDocker.g:987:5: (lv_option_7_0= 'pause_when_commit' )
                    {
                    // InternalDocker.g:987:5: (lv_option_7_0= 'pause_when_commit' )
                    // InternalDocker.g:988:6: lv_option_7_0= 'pause_when_commit'
                    {
                    lv_option_7_0=(Token)match(input,25,FOLLOW_2); 

                    						newLeafNode(lv_option_7_0, grammarAccess.getCommitOptionsAccess().getOptionPause_when_commitKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCommitOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_7_0, "pause_when_commit");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleCommitOptions"


    // $ANTLR start "entryRulePortStatement"
    // InternalDocker.g:1005:1: entryRulePortStatement returns [EObject current=null] : iv_rulePortStatement= rulePortStatement EOF ;
    public final EObject entryRulePortStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePortStatement = null;


        try {
            // InternalDocker.g:1005:54: (iv_rulePortStatement= rulePortStatement EOF )
            // InternalDocker.g:1006:2: iv_rulePortStatement= rulePortStatement EOF
            {
             newCompositeNode(grammarAccess.getPortStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePortStatement=rulePortStatement();

            state._fsp--;

             current =iv_rulePortStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePortStatement"


    // $ANTLR start "rulePortStatement"
    // InternalDocker.g:1012:1: rulePortStatement returns [EObject current=null] : (otherlv_0= 'port' ( (otherlv_1= RULE_ID ) ) ( (lv_private_port_2_0= RULE_STRING ) ) ) ;
    public final EObject rulePortStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_private_port_2_0=null;


        	enterRule();

        try {
            // InternalDocker.g:1018:2: ( (otherlv_0= 'port' ( (otherlv_1= RULE_ID ) ) ( (lv_private_port_2_0= RULE_STRING ) ) ) )
            // InternalDocker.g:1019:2: (otherlv_0= 'port' ( (otherlv_1= RULE_ID ) ) ( (lv_private_port_2_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:1019:2: (otherlv_0= 'port' ( (otherlv_1= RULE_ID ) ) ( (lv_private_port_2_0= RULE_STRING ) ) )
            // InternalDocker.g:1020:3: otherlv_0= 'port' ( (otherlv_1= RULE_ID ) ) ( (lv_private_port_2_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPortStatementAccess().getPortKeyword_0());
            		
            // InternalDocker.g:1024:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:1025:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:1025:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:1026:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_1, grammarAccess.getPortStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }

            // InternalDocker.g:1037:3: ( (lv_private_port_2_0= RULE_STRING ) )
            // InternalDocker.g:1038:4: (lv_private_port_2_0= RULE_STRING )
            {
            // InternalDocker.g:1038:4: (lv_private_port_2_0= RULE_STRING )
            // InternalDocker.g:1039:5: lv_private_port_2_0= RULE_STRING
            {
            lv_private_port_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_private_port_2_0, grammarAccess.getPortStatementAccess().getPrivate_portSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"private_port",
            						lv_private_port_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "rulePortStatement"


    // $ANTLR start "entryRuleExportStatement"
    // InternalDocker.g:1059:1: entryRuleExportStatement returns [EObject current=null] : iv_ruleExportStatement= ruleExportStatement EOF ;
    public final EObject entryRuleExportStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExportStatement = null;


        try {
            // InternalDocker.g:1059:56: (iv_ruleExportStatement= ruleExportStatement EOF )
            // InternalDocker.g:1060:2: iv_ruleExportStatement= ruleExportStatement EOF
            {
             newCompositeNode(grammarAccess.getExportStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExportStatement=ruleExportStatement();

            state._fsp--;

             current =iv_ruleExportStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExportStatement"


    // $ANTLR start "ruleExportStatement"
    // InternalDocker.g:1066:1: ruleExportStatement returns [EObject current=null] : (otherlv_0= 'export' ( (lv_file_path_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleExportStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_path_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalDocker.g:1072:2: ( (otherlv_0= 'export' ( (lv_file_path_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDocker.g:1073:2: (otherlv_0= 'export' ( (lv_file_path_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDocker.g:1073:2: (otherlv_0= 'export' ( (lv_file_path_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalDocker.g:1074:3: otherlv_0= 'export' ( (lv_file_path_1_0= RULE_STRING ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExportStatementAccess().getExportKeyword_0());
            		
            // InternalDocker.g:1078:3: ( (lv_file_path_1_0= RULE_STRING ) )
            // InternalDocker.g:1079:4: (lv_file_path_1_0= RULE_STRING )
            {
            // InternalDocker.g:1079:4: (lv_file_path_1_0= RULE_STRING )
            // InternalDocker.g:1080:5: lv_file_path_1_0= RULE_STRING
            {
            lv_file_path_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_file_path_1_0, grammarAccess.getExportStatementAccess().getFile_pathSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file_path",
            						lv_file_path_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalDocker.g:1096:3: ( (otherlv_2= RULE_ID ) )
            // InternalDocker.g:1097:4: (otherlv_2= RULE_ID )
            {
            // InternalDocker.g:1097:4: (otherlv_2= RULE_ID )
            // InternalDocker.g:1098:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExportStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getExportStatementAccess().getContainerNameContainerNameDeclarationCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleExportStatement"


    // $ANTLR start "entryRuleWaitStatement"
    // InternalDocker.g:1113:1: entryRuleWaitStatement returns [EObject current=null] : iv_ruleWaitStatement= ruleWaitStatement EOF ;
    public final EObject entryRuleWaitStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWaitStatement = null;


        try {
            // InternalDocker.g:1113:54: (iv_ruleWaitStatement= ruleWaitStatement EOF )
            // InternalDocker.g:1114:2: iv_ruleWaitStatement= ruleWaitStatement EOF
            {
             newCompositeNode(grammarAccess.getWaitStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWaitStatement=ruleWaitStatement();

            state._fsp--;

             current =iv_ruleWaitStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleWaitStatement"


    // $ANTLR start "ruleWaitStatement"
    // InternalDocker.g:1120:1: ruleWaitStatement returns [EObject current=null] : (otherlv_0= 'wait' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleWaitStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:1126:2: ( (otherlv_0= 'wait' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:1127:2: (otherlv_0= 'wait' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:1127:2: (otherlv_0= 'wait' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:1128:3: otherlv_0= 'wait' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitStatementAccess().getWaitKeyword_0());
            		
            // InternalDocker.g:1132:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:1133:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:1133:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:1134:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getWaitStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleWaitStatement"


    // $ANTLR start "entryRuleLogsStatement"
    // InternalDocker.g:1149:1: entryRuleLogsStatement returns [EObject current=null] : iv_ruleLogsStatement= ruleLogsStatement EOF ;
    public final EObject entryRuleLogsStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogsStatement = null;


        try {
            // InternalDocker.g:1149:54: (iv_ruleLogsStatement= ruleLogsStatement EOF )
            // InternalDocker.g:1150:2: iv_ruleLogsStatement= ruleLogsStatement EOF
            {
             newCompositeNode(grammarAccess.getLogsStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogsStatement=ruleLogsStatement();

            state._fsp--;

             current =iv_ruleLogsStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogsStatement"


    // $ANTLR start "ruleLogsStatement"
    // InternalDocker.g:1156:1: ruleLogsStatement returns [EObject current=null] : (otherlv_0= 'logs' ( (lv_logOptions_1_0= ruleLogOptions ) )* ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleLogsStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_logOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:1162:2: ( (otherlv_0= 'logs' ( (lv_logOptions_1_0= ruleLogOptions ) )* ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDocker.g:1163:2: (otherlv_0= 'logs' ( (lv_logOptions_1_0= ruleLogOptions ) )* ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDocker.g:1163:2: (otherlv_0= 'logs' ( (lv_logOptions_1_0= ruleLogOptions ) )* ( (otherlv_2= RULE_ID ) ) )
            // InternalDocker.g:1164:3: otherlv_0= 'logs' ( (lv_logOptions_1_0= ruleLogOptions ) )* ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getLogsStatementAccess().getLogsKeyword_0());
            		
            // InternalDocker.g:1168:3: ( (lv_logOptions_1_0= ruleLogOptions ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=30 && LA9_0<=33)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDocker.g:1169:4: (lv_logOptions_1_0= ruleLogOptions )
            	    {
            	    // InternalDocker.g:1169:4: (lv_logOptions_1_0= ruleLogOptions )
            	    // InternalDocker.g:1170:5: lv_logOptions_1_0= ruleLogOptions
            	    {

            	    					newCompositeNode(grammarAccess.getLogsStatementAccess().getLogOptionsLogOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_11);
            	    lv_logOptions_1_0=ruleLogOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLogsStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"logOptions",
            	    						lv_logOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.LogOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalDocker.g:1187:3: ( (otherlv_2= RULE_ID ) )
            // InternalDocker.g:1188:4: (otherlv_2= RULE_ID )
            {
            // InternalDocker.g:1188:4: (otherlv_2= RULE_ID )
            // InternalDocker.g:1189:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLogsStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getLogsStatementAccess().getContainerNameContainerNameDeclarationCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleLogsStatement"


    // $ANTLR start "entryRuleLogOptions"
    // InternalDocker.g:1204:1: entryRuleLogOptions returns [EObject current=null] : iv_ruleLogOptions= ruleLogOptions EOF ;
    public final EObject entryRuleLogOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogOptions = null;


        try {
            // InternalDocker.g:1204:51: (iv_ruleLogOptions= ruleLogOptions EOF )
            // InternalDocker.g:1205:2: iv_ruleLogOptions= ruleLogOptions EOF
            {
             newCompositeNode(grammarAccess.getLogOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogOptions=ruleLogOptions();

            state._fsp--;

             current =iv_ruleLogOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLogOptions"


    // $ANTLR start "ruleLogOptions"
    // InternalDocker.g:1211:1: ruleLogOptions returns [EObject current=null] : ( ( () ( (lv_option_1_0= 'track_output' ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) ) ) | ( () ( (lv_option_5_0= 'show_timestamp' ) ) ) | ( ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) ) ) ) ;
    public final EObject ruleLogOptions() throws RecognitionException {
        EObject current = null;

        Token lv_option_1_0=null;
        Token lv_option_2_0=null;
        Token lv_time_3_0=null;
        Token lv_option_5_0=null;
        Token lv_option_6_0=null;
        Token lv_number_7_0=null;


        	enterRule();

        try {
            // InternalDocker.g:1217:2: ( ( ( () ( (lv_option_1_0= 'track_output' ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) ) ) | ( () ( (lv_option_5_0= 'show_timestamp' ) ) ) | ( ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) ) ) ) )
            // InternalDocker.g:1218:2: ( ( () ( (lv_option_1_0= 'track_output' ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) ) ) | ( () ( (lv_option_5_0= 'show_timestamp' ) ) ) | ( ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) ) ) )
            {
            // InternalDocker.g:1218:2: ( ( () ( (lv_option_1_0= 'track_output' ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) ) ) | ( () ( (lv_option_5_0= 'show_timestamp' ) ) ) | ( ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt10=1;
                }
                break;
            case 31:
                {
                alt10=2;
                }
                break;
            case 32:
                {
                alt10=3;
                }
                break;
            case 33:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalDocker.g:1219:3: ( () ( (lv_option_1_0= 'track_output' ) ) )
                    {
                    // InternalDocker.g:1219:3: ( () ( (lv_option_1_0= 'track_output' ) ) )
                    // InternalDocker.g:1220:4: () ( (lv_option_1_0= 'track_output' ) )
                    {
                    // InternalDocker.g:1220:4: ()
                    // InternalDocker.g:1221:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogOptionsAccess().getLogOptionsAction_0_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:1227:4: ( (lv_option_1_0= 'track_output' ) )
                    // InternalDocker.g:1228:5: (lv_option_1_0= 'track_output' )
                    {
                    // InternalDocker.g:1228:5: (lv_option_1_0= 'track_output' )
                    // InternalDocker.g:1229:6: lv_option_1_0= 'track_output'
                    {
                    lv_option_1_0=(Token)match(input,30,FOLLOW_2); 

                    						newLeafNode(lv_option_1_0, grammarAccess.getLogOptionsAccess().getOptionTrack_outputKeyword_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_1_0, "track_output");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:1243:3: ( ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1243:3: ( ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) ) )
                    // InternalDocker.g:1244:4: ( (lv_option_2_0= 'since' ) ) ( (lv_time_3_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1244:4: ( (lv_option_2_0= 'since' ) )
                    // InternalDocker.g:1245:5: (lv_option_2_0= 'since' )
                    {
                    // InternalDocker.g:1245:5: (lv_option_2_0= 'since' )
                    // InternalDocker.g:1246:6: lv_option_2_0= 'since'
                    {
                    lv_option_2_0=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(lv_option_2_0, grammarAccess.getLogOptionsAccess().getOptionSinceKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_2_0, "since");
                    					

                    }


                    }

                    // InternalDocker.g:1258:4: ( (lv_time_3_0= RULE_STRING ) )
                    // InternalDocker.g:1259:5: (lv_time_3_0= RULE_STRING )
                    {
                    // InternalDocker.g:1259:5: (lv_time_3_0= RULE_STRING )
                    // InternalDocker.g:1260:6: lv_time_3_0= RULE_STRING
                    {
                    lv_time_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_time_3_0, grammarAccess.getLogOptionsAccess().getTimeSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"time",
                    							lv_time_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:1278:3: ( () ( (lv_option_5_0= 'show_timestamp' ) ) )
                    {
                    // InternalDocker.g:1278:3: ( () ( (lv_option_5_0= 'show_timestamp' ) ) )
                    // InternalDocker.g:1279:4: () ( (lv_option_5_0= 'show_timestamp' ) )
                    {
                    // InternalDocker.g:1279:4: ()
                    // InternalDocker.g:1280:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLogOptionsAccess().getLogOptionsAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:1286:4: ( (lv_option_5_0= 'show_timestamp' ) )
                    // InternalDocker.g:1287:5: (lv_option_5_0= 'show_timestamp' )
                    {
                    // InternalDocker.g:1287:5: (lv_option_5_0= 'show_timestamp' )
                    // InternalDocker.g:1288:6: lv_option_5_0= 'show_timestamp'
                    {
                    lv_option_5_0=(Token)match(input,32,FOLLOW_2); 

                    						newLeafNode(lv_option_5_0, grammarAccess.getLogOptionsAccess().getOptionShow_timestampKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_5_0, "show_timestamp");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:1302:3: ( ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) ) )
                    {
                    // InternalDocker.g:1302:3: ( ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) ) )
                    // InternalDocker.g:1303:4: ( (lv_option_6_0= 'show_tail_n_logs' ) ) ( (lv_number_7_0= RULE_INT ) )
                    {
                    // InternalDocker.g:1303:4: ( (lv_option_6_0= 'show_tail_n_logs' ) )
                    // InternalDocker.g:1304:5: (lv_option_6_0= 'show_tail_n_logs' )
                    {
                    // InternalDocker.g:1304:5: (lv_option_6_0= 'show_tail_n_logs' )
                    // InternalDocker.g:1305:6: lv_option_6_0= 'show_tail_n_logs'
                    {
                    lv_option_6_0=(Token)match(input,33,FOLLOW_12); 

                    						newLeafNode(lv_option_6_0, grammarAccess.getLogOptionsAccess().getOptionShow_tail_n_logsKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_6_0, "show_tail_n_logs");
                    					

                    }


                    }

                    // InternalDocker.g:1317:4: ( (lv_number_7_0= RULE_INT ) )
                    // InternalDocker.g:1318:5: (lv_number_7_0= RULE_INT )
                    {
                    // InternalDocker.g:1318:5: (lv_number_7_0= RULE_INT )
                    // InternalDocker.g:1319:6: lv_number_7_0= RULE_INT
                    {
                    lv_number_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_number_7_0, grammarAccess.getLogOptionsAccess().getNumberINTTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLogOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"number",
                    							lv_number_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleLogOptions"


    // $ANTLR start "entryRuleEventStatement"
    // InternalDocker.g:1340:1: entryRuleEventStatement returns [EObject current=null] : iv_ruleEventStatement= ruleEventStatement EOF ;
    public final EObject entryRuleEventStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventStatement = null;


        try {
            // InternalDocker.g:1340:55: (iv_ruleEventStatement= ruleEventStatement EOF )
            // InternalDocker.g:1341:2: iv_ruleEventStatement= ruleEventStatement EOF
            {
             newCompositeNode(grammarAccess.getEventStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventStatement=ruleEventStatement();

            state._fsp--;

             current =iv_ruleEventStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventStatement"


    // $ANTLR start "ruleEventStatement"
    // InternalDocker.g:1347:1: ruleEventStatement returns [EObject current=null] : (otherlv_0= 'events' ( (lv_eventOptions_1_0= ruleEventOptions ) )+ ) ;
    public final EObject ruleEventStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_eventOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:1353:2: ( (otherlv_0= 'events' ( (lv_eventOptions_1_0= ruleEventOptions ) )+ ) )
            // InternalDocker.g:1354:2: (otherlv_0= 'events' ( (lv_eventOptions_1_0= ruleEventOptions ) )+ )
            {
            // InternalDocker.g:1354:2: (otherlv_0= 'events' ( (lv_eventOptions_1_0= ruleEventOptions ) )+ )
            // InternalDocker.g:1355:3: otherlv_0= 'events' ( (lv_eventOptions_1_0= ruleEventOptions ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getEventStatementAccess().getEventsKeyword_0());
            		
            // InternalDocker.g:1359:3: ( (lv_eventOptions_1_0= ruleEventOptions ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15||LA11_0==31||LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDocker.g:1360:4: (lv_eventOptions_1_0= ruleEventOptions )
            	    {
            	    // InternalDocker.g:1360:4: (lv_eventOptions_1_0= ruleEventOptions )
            	    // InternalDocker.g:1361:5: lv_eventOptions_1_0= ruleEventOptions
            	    {

            	    					newCompositeNode(grammarAccess.getEventStatementAccess().getEventOptionsEventOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_eventOptions_1_0=ruleEventOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"eventOptions",
            	    						lv_eventOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.EventOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


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
    // $ANTLR end "ruleEventStatement"


    // $ANTLR start "entryRuleEventOptions"
    // InternalDocker.g:1382:1: entryRuleEventOptions returns [EObject current=null] : iv_ruleEventOptions= ruleEventOptions EOF ;
    public final EObject entryRuleEventOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventOptions = null;


        try {
            // InternalDocker.g:1382:53: (iv_ruleEventOptions= ruleEventOptions EOF )
            // InternalDocker.g:1383:2: iv_ruleEventOptions= ruleEventOptions EOF
            {
             newCompositeNode(grammarAccess.getEventOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventOptions=ruleEventOptions();

            state._fsp--;

             current =iv_ruleEventOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEventOptions"


    // $ANTLR start "ruleEventOptions"
    // InternalDocker.g:1389:1: ruleEventOptions returns [EObject current=null] : ( ( ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleEventOptions() throws RecognitionException {
        EObject current = null;

        Token lv_option_0_0=null;
        Token lv_commands_1_0=null;
        Token lv_option_2_0=null;
        Token lv_timeS_3_0=null;
        Token lv_option_4_0=null;
        Token lv_timeU_5_0=null;


        	enterRule();

        try {
            // InternalDocker.g:1395:2: ( ( ( ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) ) ) ) )
            // InternalDocker.g:1396:2: ( ( ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) ) ) )
            {
            // InternalDocker.g:1396:2: ( ( ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) ) ) | ( ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 35:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalDocker.g:1397:3: ( ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1397:3: ( ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) ) )
                    // InternalDocker.g:1398:4: ( (lv_option_0_0= 'filter' ) ) ( (lv_commands_1_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1398:4: ( (lv_option_0_0= 'filter' ) )
                    // InternalDocker.g:1399:5: (lv_option_0_0= 'filter' )
                    {
                    // InternalDocker.g:1399:5: (lv_option_0_0= 'filter' )
                    // InternalDocker.g:1400:6: lv_option_0_0= 'filter'
                    {
                    lv_option_0_0=(Token)match(input,15,FOLLOW_6); 

                    						newLeafNode(lv_option_0_0, grammarAccess.getEventOptionsAccess().getOptionFilterKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_0_0, "filter");
                    					

                    }


                    }

                    // InternalDocker.g:1412:4: ( (lv_commands_1_0= RULE_STRING ) )
                    // InternalDocker.g:1413:5: (lv_commands_1_0= RULE_STRING )
                    {
                    // InternalDocker.g:1413:5: (lv_commands_1_0= RULE_STRING )
                    // InternalDocker.g:1414:6: lv_commands_1_0= RULE_STRING
                    {
                    lv_commands_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_commands_1_0, grammarAccess.getEventOptionsAccess().getCommandsSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"commands",
                    							lv_commands_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:1432:3: ( ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1432:3: ( ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) ) )
                    // InternalDocker.g:1433:4: ( (lv_option_2_0= 'since' ) ) ( (lv_timeS_3_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1433:4: ( (lv_option_2_0= 'since' ) )
                    // InternalDocker.g:1434:5: (lv_option_2_0= 'since' )
                    {
                    // InternalDocker.g:1434:5: (lv_option_2_0= 'since' )
                    // InternalDocker.g:1435:6: lv_option_2_0= 'since'
                    {
                    lv_option_2_0=(Token)match(input,31,FOLLOW_6); 

                    						newLeafNode(lv_option_2_0, grammarAccess.getEventOptionsAccess().getOptionSinceKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_2_0, "since");
                    					

                    }


                    }

                    // InternalDocker.g:1447:4: ( (lv_timeS_3_0= RULE_STRING ) )
                    // InternalDocker.g:1448:5: (lv_timeS_3_0= RULE_STRING )
                    {
                    // InternalDocker.g:1448:5: (lv_timeS_3_0= RULE_STRING )
                    // InternalDocker.g:1449:6: lv_timeS_3_0= RULE_STRING
                    {
                    lv_timeS_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_timeS_3_0, grammarAccess.getEventOptionsAccess().getTimeSSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"timeS",
                    							lv_timeS_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:1467:3: ( ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1467:3: ( ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) ) )
                    // InternalDocker.g:1468:4: ( (lv_option_4_0= 'until' ) ) ( (lv_timeU_5_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1468:4: ( (lv_option_4_0= 'until' ) )
                    // InternalDocker.g:1469:5: (lv_option_4_0= 'until' )
                    {
                    // InternalDocker.g:1469:5: (lv_option_4_0= 'until' )
                    // InternalDocker.g:1470:6: lv_option_4_0= 'until'
                    {
                    lv_option_4_0=(Token)match(input,35,FOLLOW_6); 

                    						newLeafNode(lv_option_4_0, grammarAccess.getEventOptionsAccess().getOptionUntilKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_4_0, "until");
                    					

                    }


                    }

                    // InternalDocker.g:1482:4: ( (lv_timeU_5_0= RULE_STRING ) )
                    // InternalDocker.g:1483:5: (lv_timeU_5_0= RULE_STRING )
                    {
                    // InternalDocker.g:1483:5: (lv_timeU_5_0= RULE_STRING )
                    // InternalDocker.g:1484:6: lv_timeU_5_0= RULE_STRING
                    {
                    lv_timeU_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_timeU_5_0, grammarAccess.getEventOptionsAccess().getTimeUSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"timeU",
                    							lv_timeU_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleEventOptions"


    // $ANTLR start "entryRuleAttachStatement"
    // InternalDocker.g:1505:1: entryRuleAttachStatement returns [EObject current=null] : iv_ruleAttachStatement= ruleAttachStatement EOF ;
    public final EObject entryRuleAttachStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttachStatement = null;


        try {
            // InternalDocker.g:1505:56: (iv_ruleAttachStatement= ruleAttachStatement EOF )
            // InternalDocker.g:1506:2: iv_ruleAttachStatement= ruleAttachStatement EOF
            {
             newCompositeNode(grammarAccess.getAttachStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttachStatement=ruleAttachStatement();

            state._fsp--;

             current =iv_ruleAttachStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAttachStatement"


    // $ANTLR start "ruleAttachStatement"
    // InternalDocker.g:1512:1: ruleAttachStatement returns [EObject current=null] : (otherlv_0= 'attach' ( (lv_attachOption_1_0= ruleAttachOption ) ) ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleAttachStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_attachOption_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:1518:2: ( (otherlv_0= 'attach' ( (lv_attachOption_1_0= ruleAttachOption ) ) ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDocker.g:1519:2: (otherlv_0= 'attach' ( (lv_attachOption_1_0= ruleAttachOption ) ) ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDocker.g:1519:2: (otherlv_0= 'attach' ( (lv_attachOption_1_0= ruleAttachOption ) ) ( (otherlv_2= RULE_ID ) ) )
            // InternalDocker.g:1520:3: otherlv_0= 'attach' ( (lv_attachOption_1_0= ruleAttachOption ) ) ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getAttachStatementAccess().getAttachKeyword_0());
            		
            // InternalDocker.g:1524:3: ( (lv_attachOption_1_0= ruleAttachOption ) )
            // InternalDocker.g:1525:4: (lv_attachOption_1_0= ruleAttachOption )
            {
            // InternalDocker.g:1525:4: (lv_attachOption_1_0= ruleAttachOption )
            // InternalDocker.g:1526:5: lv_attachOption_1_0= ruleAttachOption
            {

            					newCompositeNode(grammarAccess.getAttachStatementAccess().getAttachOptionAttachOptionEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_attachOption_1_0=ruleAttachOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttachStatementRule());
            					}
            					set(
            						current,
            						"attachOption",
            						lv_attachOption_1_0,
            						"uk.ac.kcl.inf.group20.docker.Docker.AttachOption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDocker.g:1543:3: ( (otherlv_2= RULE_ID ) )
            // InternalDocker.g:1544:4: (otherlv_2= RULE_ID )
            {
            // InternalDocker.g:1544:4: (otherlv_2= RULE_ID )
            // InternalDocker.g:1545:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttachStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getAttachStatementAccess().getContainerNameContainerNameDeclarationCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleAttachStatement"


    // $ANTLR start "entryRuleInspectStatement"
    // InternalDocker.g:1560:1: entryRuleInspectStatement returns [EObject current=null] : iv_ruleInspectStatement= ruleInspectStatement EOF ;
    public final EObject entryRuleInspectStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInspectStatement = null;


        try {
            // InternalDocker.g:1560:57: (iv_ruleInspectStatement= ruleInspectStatement EOF )
            // InternalDocker.g:1561:2: iv_ruleInspectStatement= ruleInspectStatement EOF
            {
             newCompositeNode(grammarAccess.getInspectStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInspectStatement=ruleInspectStatement();

            state._fsp--;

             current =iv_ruleInspectStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInspectStatement"


    // $ANTLR start "ruleInspectStatement"
    // InternalDocker.g:1567:1: ruleInspectStatement returns [EObject current=null] : (otherlv_0= 'inspect' ( (lv_inspectOptions_1_0= ruleInspectOptions ) )+ ) ;
    public final EObject ruleInspectStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_inspectOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:1573:2: ( (otherlv_0= 'inspect' ( (lv_inspectOptions_1_0= ruleInspectOptions ) )+ ) )
            // InternalDocker.g:1574:2: (otherlv_0= 'inspect' ( (lv_inspectOptions_1_0= ruleInspectOptions ) )+ )
            {
            // InternalDocker.g:1574:2: (otherlv_0= 'inspect' ( (lv_inspectOptions_1_0= ruleInspectOptions ) )+ )
            // InternalDocker.g:1575:3: otherlv_0= 'inspect' ( (lv_inspectOptions_1_0= ruleInspectOptions ) )+
            {
            otherlv_0=(Token)match(input,37,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getInspectStatementAccess().getInspectKeyword_0());
            		
            // InternalDocker.g:1579:3: ( (lv_inspectOptions_1_0= ruleInspectOptions ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16||(LA13_0>=38 && LA13_0<=39)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDocker.g:1580:4: (lv_inspectOptions_1_0= ruleInspectOptions )
            	    {
            	    // InternalDocker.g:1580:4: (lv_inspectOptions_1_0= ruleInspectOptions )
            	    // InternalDocker.g:1581:5: lv_inspectOptions_1_0= ruleInspectOptions
            	    {

            	    					newCompositeNode(grammarAccess.getInspectStatementAccess().getInspectOptionsInspectOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_inspectOptions_1_0=ruleInspectOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getInspectStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inspectOptions",
            	    						lv_inspectOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.InspectOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


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
    // $ANTLR end "ruleInspectStatement"


    // $ANTLR start "entryRuleInspectOptions"
    // InternalDocker.g:1602:1: entryRuleInspectOptions returns [EObject current=null] : iv_ruleInspectOptions= ruleInspectOptions EOF ;
    public final EObject entryRuleInspectOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInspectOptions = null;


        try {
            // InternalDocker.g:1602:55: (iv_ruleInspectOptions= ruleInspectOptions EOF )
            // InternalDocker.g:1603:2: iv_ruleInspectOptions= ruleInspectOptions EOF
            {
             newCompositeNode(grammarAccess.getInspectOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInspectOptions=ruleInspectOptions();

            state._fsp--;

             current =iv_ruleInspectOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInspectOptions"


    // $ANTLR start "ruleInspectOptions"
    // InternalDocker.g:1609:1: ruleInspectOptions returns [EObject current=null] : ( ( ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) ) ) | ( (lv_option_2_0= 'show_size' ) ) | ( ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleInspectOptions() throws RecognitionException {
        EObject current = null;

        Token lv_option_0_0=null;
        Token lv_formats_1_0=null;
        Token lv_option_2_0=null;
        Token lv_option_3_0=null;
        Token lv_types_4_0=null;


        	enterRule();

        try {
            // InternalDocker.g:1615:2: ( ( ( ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) ) ) | ( (lv_option_2_0= 'show_size' ) ) | ( ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) ) ) ) )
            // InternalDocker.g:1616:2: ( ( ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) ) ) | ( (lv_option_2_0= 'show_size' ) ) | ( ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) ) ) )
            {
            // InternalDocker.g:1616:2: ( ( ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) ) ) | ( (lv_option_2_0= 'show_size' ) ) | ( ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt14=1;
                }
                break;
            case 38:
                {
                alt14=2;
                }
                break;
            case 39:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalDocker.g:1617:3: ( ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1617:3: ( ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) ) )
                    // InternalDocker.g:1618:4: ( (lv_option_0_0= 'format' ) ) ( (lv_formats_1_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1618:4: ( (lv_option_0_0= 'format' ) )
                    // InternalDocker.g:1619:5: (lv_option_0_0= 'format' )
                    {
                    // InternalDocker.g:1619:5: (lv_option_0_0= 'format' )
                    // InternalDocker.g:1620:6: lv_option_0_0= 'format'
                    {
                    lv_option_0_0=(Token)match(input,16,FOLLOW_6); 

                    						newLeafNode(lv_option_0_0, grammarAccess.getInspectOptionsAccess().getOptionFormatKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInspectOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_0_0, "format");
                    					

                    }


                    }

                    // InternalDocker.g:1632:4: ( (lv_formats_1_0= RULE_STRING ) )
                    // InternalDocker.g:1633:5: (lv_formats_1_0= RULE_STRING )
                    {
                    // InternalDocker.g:1633:5: (lv_formats_1_0= RULE_STRING )
                    // InternalDocker.g:1634:6: lv_formats_1_0= RULE_STRING
                    {
                    lv_formats_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_formats_1_0, grammarAccess.getInspectOptionsAccess().getFormatsSTRINGTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInspectOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"formats",
                    							lv_formats_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:1652:3: ( (lv_option_2_0= 'show_size' ) )
                    {
                    // InternalDocker.g:1652:3: ( (lv_option_2_0= 'show_size' ) )
                    // InternalDocker.g:1653:4: (lv_option_2_0= 'show_size' )
                    {
                    // InternalDocker.g:1653:4: (lv_option_2_0= 'show_size' )
                    // InternalDocker.g:1654:5: lv_option_2_0= 'show_size'
                    {
                    lv_option_2_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_option_2_0, grammarAccess.getInspectOptionsAccess().getOptionShow_sizeKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInspectOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_2_0, "show_size");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:1667:3: ( ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1667:3: ( ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) ) )
                    // InternalDocker.g:1668:4: ( (lv_option_3_0= 'type' ) ) ( (lv_types_4_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1668:4: ( (lv_option_3_0= 'type' ) )
                    // InternalDocker.g:1669:5: (lv_option_3_0= 'type' )
                    {
                    // InternalDocker.g:1669:5: (lv_option_3_0= 'type' )
                    // InternalDocker.g:1670:6: lv_option_3_0= 'type'
                    {
                    lv_option_3_0=(Token)match(input,39,FOLLOW_6); 

                    						newLeafNode(lv_option_3_0, grammarAccess.getInspectOptionsAccess().getOptionTypeKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInspectOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_3_0, "type");
                    					

                    }


                    }

                    // InternalDocker.g:1682:4: ( (lv_types_4_0= RULE_STRING ) )
                    // InternalDocker.g:1683:5: (lv_types_4_0= RULE_STRING )
                    {
                    // InternalDocker.g:1683:5: (lv_types_4_0= RULE_STRING )
                    // InternalDocker.g:1684:6: lv_types_4_0= RULE_STRING
                    {
                    lv_types_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_types_4_0, grammarAccess.getInspectOptionsAccess().getTypesSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getInspectOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"types",
                    							lv_types_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleInspectOptions"


    // $ANTLR start "entryRulePsStatement"
    // InternalDocker.g:1705:1: entryRulePsStatement returns [EObject current=null] : iv_rulePsStatement= rulePsStatement EOF ;
    public final EObject entryRulePsStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePsStatement = null;


        try {
            // InternalDocker.g:1705:52: (iv_rulePsStatement= rulePsStatement EOF )
            // InternalDocker.g:1706:2: iv_rulePsStatement= rulePsStatement EOF
            {
             newCompositeNode(grammarAccess.getPsStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePsStatement=rulePsStatement();

            state._fsp--;

             current =iv_rulePsStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePsStatement"


    // $ANTLR start "rulePsStatement"
    // InternalDocker.g:1712:1: rulePsStatement returns [EObject current=null] : (otherlv_0= 'ps' ( (lv_psOptions_1_0= rulePsOptions ) )+ ) ;
    public final EObject rulePsStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_psOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:1718:2: ( (otherlv_0= 'ps' ( (lv_psOptions_1_0= rulePsOptions ) )+ ) )
            // InternalDocker.g:1719:2: (otherlv_0= 'ps' ( (lv_psOptions_1_0= rulePsOptions ) )+ )
            {
            // InternalDocker.g:1719:2: (otherlv_0= 'ps' ( (lv_psOptions_1_0= rulePsOptions ) )+ )
            // InternalDocker.g:1720:3: otherlv_0= 'ps' ( (lv_psOptions_1_0= rulePsOptions ) )+
            {
            otherlv_0=(Token)match(input,40,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getPsStatementAccess().getPsKeyword_0());
            		
            // InternalDocker.g:1724:3: ( (lv_psOptions_1_0= rulePsOptions ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=15 && LA15_0<=17)||LA15_0==38||(LA15_0>=41 && LA15_0<=45)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalDocker.g:1725:4: (lv_psOptions_1_0= rulePsOptions )
            	    {
            	    // InternalDocker.g:1725:4: (lv_psOptions_1_0= rulePsOptions )
            	    // InternalDocker.g:1726:5: lv_psOptions_1_0= rulePsOptions
            	    {

            	    					newCompositeNode(grammarAccess.getPsStatementAccess().getPsOptionsPsOptionsParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_19);
            	    lv_psOptions_1_0=rulePsOptions();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPsStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"psOptions",
            	    						lv_psOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.PsOptions");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


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
    // $ANTLR end "rulePsStatement"


    // $ANTLR start "entryRulePsOptions"
    // InternalDocker.g:1747:1: entryRulePsOptions returns [EObject current=null] : iv_rulePsOptions= rulePsOptions EOF ;
    public final EObject entryRulePsOptions() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePsOptions = null;


        try {
            // InternalDocker.g:1747:50: (iv_rulePsOptions= rulePsOptions EOF )
            // InternalDocker.g:1748:2: iv_rulePsOptions= rulePsOptions EOF
            {
             newCompositeNode(grammarAccess.getPsOptionsRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePsOptions=rulePsOptions();

            state._fsp--;

             current =iv_rulePsOptions; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePsOptions"


    // $ANTLR start "rulePsOptions"
    // InternalDocker.g:1754:1: rulePsOptions returns [EObject current=null] : ( ( (lv_option_0_0= 'show_container' ) ) | ( (lv_option_1_0= 'show_all_containers' ) ) | ( ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) ) ) | ( (lv_option_6_0= 'show_last_container' ) ) | ( ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) ) ) | ( (lv_option_9_0= 'complete' ) ) | ( (lv_option_10_0= 'only_show_id' ) ) | ( (lv_option_11_0= 'show_size' ) ) ) ;
    public final EObject rulePsOptions() throws RecognitionException {
        EObject current = null;

        Token lv_option_0_0=null;
        Token lv_option_1_0=null;
        Token lv_option_2_0=null;
        Token lv_commands_3_0=null;
        Token lv_option_4_0=null;
        Token lv_formats_5_0=null;
        Token lv_option_6_0=null;
        Token lv_option_7_0=null;
        Token lv_n_8_0=null;
        Token lv_option_9_0=null;
        Token lv_option_10_0=null;
        Token lv_option_11_0=null;


        	enterRule();

        try {
            // InternalDocker.g:1760:2: ( ( ( (lv_option_0_0= 'show_container' ) ) | ( (lv_option_1_0= 'show_all_containers' ) ) | ( ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) ) ) | ( (lv_option_6_0= 'show_last_container' ) ) | ( ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) ) ) | ( (lv_option_9_0= 'complete' ) ) | ( (lv_option_10_0= 'only_show_id' ) ) | ( (lv_option_11_0= 'show_size' ) ) ) )
            // InternalDocker.g:1761:2: ( ( (lv_option_0_0= 'show_container' ) ) | ( (lv_option_1_0= 'show_all_containers' ) ) | ( ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) ) ) | ( (lv_option_6_0= 'show_last_container' ) ) | ( ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) ) ) | ( (lv_option_9_0= 'complete' ) ) | ( (lv_option_10_0= 'only_show_id' ) ) | ( (lv_option_11_0= 'show_size' ) ) )
            {
            // InternalDocker.g:1761:2: ( ( (lv_option_0_0= 'show_container' ) ) | ( (lv_option_1_0= 'show_all_containers' ) ) | ( ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) | ( ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) ) ) | ( (lv_option_6_0= 'show_last_container' ) ) | ( ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) ) ) | ( (lv_option_9_0= 'complete' ) ) | ( (lv_option_10_0= 'only_show_id' ) ) | ( (lv_option_11_0= 'show_size' ) ) )
            int alt16=9;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt16=1;
                }
                break;
            case 42:
                {
                alt16=2;
                }
                break;
            case 15:
                {
                alt16=3;
                }
                break;
            case 16:
                {
                alt16=4;
                }
                break;
            case 43:
                {
                alt16=5;
                }
                break;
            case 44:
                {
                alt16=6;
                }
                break;
            case 17:
                {
                alt16=7;
                }
                break;
            case 45:
                {
                alt16=8;
                }
                break;
            case 38:
                {
                alt16=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDocker.g:1762:3: ( (lv_option_0_0= 'show_container' ) )
                    {
                    // InternalDocker.g:1762:3: ( (lv_option_0_0= 'show_container' ) )
                    // InternalDocker.g:1763:4: (lv_option_0_0= 'show_container' )
                    {
                    // InternalDocker.g:1763:4: (lv_option_0_0= 'show_container' )
                    // InternalDocker.g:1764:5: lv_option_0_0= 'show_container'
                    {
                    lv_option_0_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_option_0_0, grammarAccess.getPsOptionsAccess().getOptionShow_containerKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPsOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_0_0, "show_container");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:1777:3: ( (lv_option_1_0= 'show_all_containers' ) )
                    {
                    // InternalDocker.g:1777:3: ( (lv_option_1_0= 'show_all_containers' ) )
                    // InternalDocker.g:1778:4: (lv_option_1_0= 'show_all_containers' )
                    {
                    // InternalDocker.g:1778:4: (lv_option_1_0= 'show_all_containers' )
                    // InternalDocker.g:1779:5: lv_option_1_0= 'show_all_containers'
                    {
                    lv_option_1_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_option_1_0, grammarAccess.getPsOptionsAccess().getOptionShow_all_containersKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPsOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_1_0, "show_all_containers");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:1792:3: ( ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1792:3: ( ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) ) )
                    // InternalDocker.g:1793:4: ( (lv_option_2_0= 'filter' ) ) ( (lv_commands_3_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1793:4: ( (lv_option_2_0= 'filter' ) )
                    // InternalDocker.g:1794:5: (lv_option_2_0= 'filter' )
                    {
                    // InternalDocker.g:1794:5: (lv_option_2_0= 'filter' )
                    // InternalDocker.g:1795:6: lv_option_2_0= 'filter'
                    {
                    lv_option_2_0=(Token)match(input,15,FOLLOW_6); 

                    						newLeafNode(lv_option_2_0, grammarAccess.getPsOptionsAccess().getOptionFilterKeyword_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPsOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_2_0, "filter");
                    					

                    }


                    }

                    // InternalDocker.g:1807:4: ( (lv_commands_3_0= RULE_STRING ) )
                    // InternalDocker.g:1808:5: (lv_commands_3_0= RULE_STRING )
                    {
                    // InternalDocker.g:1808:5: (lv_commands_3_0= RULE_STRING )
                    // InternalDocker.g:1809:6: lv_commands_3_0= RULE_STRING
                    {
                    lv_commands_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_commands_3_0, grammarAccess.getPsOptionsAccess().getCommandsSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPsOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"commands",
                    							lv_commands_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:1827:3: ( ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:1827:3: ( ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) ) )
                    // InternalDocker.g:1828:4: ( (lv_option_4_0= 'format' ) ) ( (lv_formats_5_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:1828:4: ( (lv_option_4_0= 'format' ) )
                    // InternalDocker.g:1829:5: (lv_option_4_0= 'format' )
                    {
                    // InternalDocker.g:1829:5: (lv_option_4_0= 'format' )
                    // InternalDocker.g:1830:6: lv_option_4_0= 'format'
                    {
                    lv_option_4_0=(Token)match(input,16,FOLLOW_6); 

                    						newLeafNode(lv_option_4_0, grammarAccess.getPsOptionsAccess().getOptionFormatKeyword_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPsOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_4_0, "format");
                    					

                    }


                    }

                    // InternalDocker.g:1842:4: ( (lv_formats_5_0= RULE_STRING ) )
                    // InternalDocker.g:1843:5: (lv_formats_5_0= RULE_STRING )
                    {
                    // InternalDocker.g:1843:5: (lv_formats_5_0= RULE_STRING )
                    // InternalDocker.g:1844:6: lv_formats_5_0= RULE_STRING
                    {
                    lv_formats_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_formats_5_0, grammarAccess.getPsOptionsAccess().getFormatsSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPsOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"formats",
                    							lv_formats_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDocker.g:1862:3: ( (lv_option_6_0= 'show_last_container' ) )
                    {
                    // InternalDocker.g:1862:3: ( (lv_option_6_0= 'show_last_container' ) )
                    // InternalDocker.g:1863:4: (lv_option_6_0= 'show_last_container' )
                    {
                    // InternalDocker.g:1863:4: (lv_option_6_0= 'show_last_container' )
                    // InternalDocker.g:1864:5: lv_option_6_0= 'show_last_container'
                    {
                    lv_option_6_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_option_6_0, grammarAccess.getPsOptionsAccess().getOptionShow_last_containerKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPsOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_6_0, "show_last_container");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDocker.g:1877:3: ( ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) ) )
                    {
                    // InternalDocker.g:1877:3: ( ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) ) )
                    // InternalDocker.g:1878:4: ( (lv_option_7_0= 'list_last_n_containers' ) ) ( (lv_n_8_0= RULE_INT ) )
                    {
                    // InternalDocker.g:1878:4: ( (lv_option_7_0= 'list_last_n_containers' ) )
                    // InternalDocker.g:1879:5: (lv_option_7_0= 'list_last_n_containers' )
                    {
                    // InternalDocker.g:1879:5: (lv_option_7_0= 'list_last_n_containers' )
                    // InternalDocker.g:1880:6: lv_option_7_0= 'list_last_n_containers'
                    {
                    lv_option_7_0=(Token)match(input,44,FOLLOW_12); 

                    						newLeafNode(lv_option_7_0, grammarAccess.getPsOptionsAccess().getOptionList_last_n_containersKeyword_5_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPsOptionsRule());
                    						}
                    						setWithLastConsumed(current, "option", lv_option_7_0, "list_last_n_containers");
                    					

                    }


                    }

                    // InternalDocker.g:1892:4: ( (lv_n_8_0= RULE_INT ) )
                    // InternalDocker.g:1893:5: (lv_n_8_0= RULE_INT )
                    {
                    // InternalDocker.g:1893:5: (lv_n_8_0= RULE_INT )
                    // InternalDocker.g:1894:6: lv_n_8_0= RULE_INT
                    {
                    lv_n_8_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_n_8_0, grammarAccess.getPsOptionsAccess().getNINTTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPsOptionsRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"n",
                    							lv_n_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDocker.g:1912:3: ( (lv_option_9_0= 'complete' ) )
                    {
                    // InternalDocker.g:1912:3: ( (lv_option_9_0= 'complete' ) )
                    // InternalDocker.g:1913:4: (lv_option_9_0= 'complete' )
                    {
                    // InternalDocker.g:1913:4: (lv_option_9_0= 'complete' )
                    // InternalDocker.g:1914:5: lv_option_9_0= 'complete'
                    {
                    lv_option_9_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_option_9_0, grammarAccess.getPsOptionsAccess().getOptionCompleteKeyword_6_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPsOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_9_0, "complete");
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDocker.g:1927:3: ( (lv_option_10_0= 'only_show_id' ) )
                    {
                    // InternalDocker.g:1927:3: ( (lv_option_10_0= 'only_show_id' ) )
                    // InternalDocker.g:1928:4: (lv_option_10_0= 'only_show_id' )
                    {
                    // InternalDocker.g:1928:4: (lv_option_10_0= 'only_show_id' )
                    // InternalDocker.g:1929:5: lv_option_10_0= 'only_show_id'
                    {
                    lv_option_10_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_option_10_0, grammarAccess.getPsOptionsAccess().getOptionOnly_show_idKeyword_7_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPsOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_10_0, "only_show_id");
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDocker.g:1942:3: ( (lv_option_11_0= 'show_size' ) )
                    {
                    // InternalDocker.g:1942:3: ( (lv_option_11_0= 'show_size' ) )
                    // InternalDocker.g:1943:4: (lv_option_11_0= 'show_size' )
                    {
                    // InternalDocker.g:1943:4: (lv_option_11_0= 'show_size' )
                    // InternalDocker.g:1944:5: lv_option_11_0= 'show_size'
                    {
                    lv_option_11_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_option_11_0, grammarAccess.getPsOptionsAccess().getOptionShow_sizeKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPsOptionsRule());
                    					}
                    					setWithLastConsumed(current, "option", lv_option_11_0, "show_size");
                    				

                    }


                    }


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
    // $ANTLR end "rulePsOptions"


    // $ANTLR start "entryRuleExecStatement"
    // InternalDocker.g:1960:1: entryRuleExecStatement returns [EObject current=null] : iv_ruleExecStatement= ruleExecStatement EOF ;
    public final EObject entryRuleExecStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExecStatement = null;


        try {
            // InternalDocker.g:1960:54: (iv_ruleExecStatement= ruleExecStatement EOF )
            // InternalDocker.g:1961:2: iv_ruleExecStatement= ruleExecStatement EOF
            {
             newCompositeNode(grammarAccess.getExecStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExecStatement=ruleExecStatement();

            state._fsp--;

             current =iv_ruleExecStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExecStatement"


    // $ANTLR start "ruleExecStatement"
    // InternalDocker.g:1967:1: ruleExecStatement returns [EObject current=null] : (otherlv_0= 'execute' ( (lv_execOptions_1_0= ruleExecOption ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleExecStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_commands_3_0=null;
        Enumerator lv_execOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:1973:2: ( (otherlv_0= 'execute' ( (lv_execOptions_1_0= ruleExecOption ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) )
            // InternalDocker.g:1974:2: (otherlv_0= 'execute' ( (lv_execOptions_1_0= ruleExecOption ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_commands_3_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:1974:2: (otherlv_0= 'execute' ( (lv_execOptions_1_0= ruleExecOption ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_commands_3_0= RULE_STRING ) ) )
            // InternalDocker.g:1975:3: otherlv_0= 'execute' ( (lv_execOptions_1_0= ruleExecOption ) )* ( (otherlv_2= RULE_ID ) ) ( (lv_commands_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getExecStatementAccess().getExecuteKeyword_0());
            		
            // InternalDocker.g:1979:3: ( (lv_execOptions_1_0= ruleExecOption ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==54||LA17_0==58||LA17_0==75) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalDocker.g:1980:4: (lv_execOptions_1_0= ruleExecOption )
            	    {
            	    // InternalDocker.g:1980:4: (lv_execOptions_1_0= ruleExecOption )
            	    // InternalDocker.g:1981:5: lv_execOptions_1_0= ruleExecOption
            	    {

            	    					newCompositeNode(grammarAccess.getExecStatementAccess().getExecOptionsExecOptionEnumRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_execOptions_1_0=ruleExecOption();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getExecStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"execOptions",
            	    						lv_execOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.ExecOption");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            // InternalDocker.g:1998:3: ( (otherlv_2= RULE_ID ) )
            // InternalDocker.g:1999:4: (otherlv_2= RULE_ID )
            {
            // InternalDocker.g:1999:4: (otherlv_2= RULE_ID )
            // InternalDocker.g:2000:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_2, grammarAccess.getExecStatementAccess().getContainerNameContainerNameDeclarationCrossReference_2_0());
            				

            }


            }

            // InternalDocker.g:2011:3: ( (lv_commands_3_0= RULE_STRING ) )
            // InternalDocker.g:2012:4: (lv_commands_3_0= RULE_STRING )
            {
            // InternalDocker.g:2012:4: (lv_commands_3_0= RULE_STRING )
            // InternalDocker.g:2013:5: lv_commands_3_0= RULE_STRING
            {
            lv_commands_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_commands_3_0, grammarAccess.getExecStatementAccess().getCommandsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExecStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleExecStatement"


    // $ANTLR start "entryRuleUnpauseStatement"
    // InternalDocker.g:2033:1: entryRuleUnpauseStatement returns [EObject current=null] : iv_ruleUnpauseStatement= ruleUnpauseStatement EOF ;
    public final EObject entryRuleUnpauseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnpauseStatement = null;


        try {
            // InternalDocker.g:2033:57: (iv_ruleUnpauseStatement= ruleUnpauseStatement EOF )
            // InternalDocker.g:2034:2: iv_ruleUnpauseStatement= ruleUnpauseStatement EOF
            {
             newCompositeNode(grammarAccess.getUnpauseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnpauseStatement=ruleUnpauseStatement();

            state._fsp--;

             current =iv_ruleUnpauseStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnpauseStatement"


    // $ANTLR start "ruleUnpauseStatement"
    // InternalDocker.g:2040:1: ruleUnpauseStatement returns [EObject current=null] : (otherlv_0= 'unpause' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleUnpauseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2046:2: ( (otherlv_0= 'unpause' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:2047:2: (otherlv_0= 'unpause' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:2047:2: (otherlv_0= 'unpause' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:2048:3: otherlv_0= 'unpause' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getUnpauseStatementAccess().getUnpauseKeyword_0());
            		
            // InternalDocker.g:2052:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:2053:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:2053:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:2054:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUnpauseStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getUnpauseStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleUnpauseStatement"


    // $ANTLR start "entryRulePauseStatement"
    // InternalDocker.g:2069:1: entryRulePauseStatement returns [EObject current=null] : iv_rulePauseStatement= rulePauseStatement EOF ;
    public final EObject entryRulePauseStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePauseStatement = null;


        try {
            // InternalDocker.g:2069:55: (iv_rulePauseStatement= rulePauseStatement EOF )
            // InternalDocker.g:2070:2: iv_rulePauseStatement= rulePauseStatement EOF
            {
             newCompositeNode(grammarAccess.getPauseStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePauseStatement=rulePauseStatement();

            state._fsp--;

             current =iv_rulePauseStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePauseStatement"


    // $ANTLR start "rulePauseStatement"
    // InternalDocker.g:2076:1: rulePauseStatement returns [EObject current=null] : (otherlv_0= 'pause' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject rulePauseStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2082:2: ( (otherlv_0= 'pause' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:2083:2: (otherlv_0= 'pause' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:2083:2: (otherlv_0= 'pause' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:2084:3: otherlv_0= 'pause' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPauseStatementAccess().getPauseKeyword_0());
            		
            // InternalDocker.g:2088:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:2089:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:2089:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:2090:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPauseStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getPauseStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "rulePauseStatement"


    // $ANTLR start "entryRuleRestartStatement"
    // InternalDocker.g:2105:1: entryRuleRestartStatement returns [EObject current=null] : iv_ruleRestartStatement= ruleRestartStatement EOF ;
    public final EObject entryRuleRestartStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestartStatement = null;


        try {
            // InternalDocker.g:2105:57: (iv_ruleRestartStatement= ruleRestartStatement EOF )
            // InternalDocker.g:2106:2: iv_ruleRestartStatement= ruleRestartStatement EOF
            {
             newCompositeNode(grammarAccess.getRestartStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestartStatement=ruleRestartStatement();

            state._fsp--;

             current =iv_ruleRestartStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRestartStatement"


    // $ANTLR start "ruleRestartStatement"
    // InternalDocker.g:2112:1: ruleRestartStatement returns [EObject current=null] : (otherlv_0= 'restart' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleRestartStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2118:2: ( (otherlv_0= 'restart' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:2119:2: (otherlv_0= 'restart' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:2119:2: (otherlv_0= 'restart' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:2120:3: otherlv_0= 'restart' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getRestartStatementAccess().getRestartKeyword_0());
            		
            // InternalDocker.g:2124:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:2125:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:2125:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:2126:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRestartStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getRestartStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleRestartStatement"


    // $ANTLR start "entryRuleStopStatement"
    // InternalDocker.g:2141:1: entryRuleStopStatement returns [EObject current=null] : iv_ruleStopStatement= ruleStopStatement EOF ;
    public final EObject entryRuleStopStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStopStatement = null;


        try {
            // InternalDocker.g:2141:54: (iv_ruleStopStatement= ruleStopStatement EOF )
            // InternalDocker.g:2142:2: iv_ruleStopStatement= ruleStopStatement EOF
            {
             newCompositeNode(grammarAccess.getStopStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStopStatement=ruleStopStatement();

            state._fsp--;

             current =iv_ruleStopStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStopStatement"


    // $ANTLR start "ruleStopStatement"
    // InternalDocker.g:2148:1: ruleStopStatement returns [EObject current=null] : (otherlv_0= 'stop' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleStopStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2154:2: ( (otherlv_0= 'stop' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:2155:2: (otherlv_0= 'stop' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:2155:2: (otherlv_0= 'stop' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:2156:3: otherlv_0= 'stop' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStopStatementAccess().getStopKeyword_0());
            		
            // InternalDocker.g:2160:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:2161:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:2161:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:2162:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStopStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getStopStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleStopStatement"


    // $ANTLR start "entryRuleStartStatement"
    // InternalDocker.g:2177:1: entryRuleStartStatement returns [EObject current=null] : iv_ruleStartStatement= ruleStartStatement EOF ;
    public final EObject entryRuleStartStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStartStatement = null;


        try {
            // InternalDocker.g:2177:55: (iv_ruleStartStatement= ruleStartStatement EOF )
            // InternalDocker.g:2178:2: iv_ruleStartStatement= ruleStartStatement EOF
            {
             newCompositeNode(grammarAccess.getStartStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStartStatement=ruleStartStatement();

            state._fsp--;

             current =iv_ruleStartStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStartStatement"


    // $ANTLR start "ruleStartStatement"
    // InternalDocker.g:2184:1: ruleStartStatement returns [EObject current=null] : (otherlv_0= 'start' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleStartStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2190:2: ( (otherlv_0= 'start' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:2191:2: (otherlv_0= 'start' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:2191:2: (otherlv_0= 'start' ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:2192:3: otherlv_0= 'start' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,51,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getStartStatementAccess().getStartKeyword_0());
            		
            // InternalDocker.g:2196:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:2197:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:2197:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:2198:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStartStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getStartStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleStartStatement"


    // $ANTLR start "entryRuleKillStatement"
    // InternalDocker.g:2213:1: entryRuleKillStatement returns [EObject current=null] : iv_ruleKillStatement= ruleKillStatement EOF ;
    public final EObject entryRuleKillStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKillStatement = null;


        try {
            // InternalDocker.g:2213:54: (iv_ruleKillStatement= ruleKillStatement EOF )
            // InternalDocker.g:2214:2: iv_ruleKillStatement= ruleKillStatement EOF
            {
             newCompositeNode(grammarAccess.getKillStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKillStatement=ruleKillStatement();

            state._fsp--;

             current =iv_ruleKillStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKillStatement"


    // $ANTLR start "ruleKillStatement"
    // InternalDocker.g:2220:1: ruleKillStatement returns [EObject current=null] : ( ( (lv_kill_0_0= ruleKillOption ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleKillStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Enumerator lv_kill_0_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:2226:2: ( ( ( (lv_kill_0_0= ruleKillOption ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalDocker.g:2227:2: ( ( (lv_kill_0_0= ruleKillOption ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalDocker.g:2227:2: ( ( (lv_kill_0_0= ruleKillOption ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalDocker.g:2228:3: ( (lv_kill_0_0= ruleKillOption ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalDocker.g:2228:3: ( (lv_kill_0_0= ruleKillOption ) )
            // InternalDocker.g:2229:4: (lv_kill_0_0= ruleKillOption )
            {
            // InternalDocker.g:2229:4: (lv_kill_0_0= ruleKillOption )
            // InternalDocker.g:2230:5: lv_kill_0_0= ruleKillOption
            {

            					newCompositeNode(grammarAccess.getKillStatementAccess().getKillKillOptionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_kill_0_0=ruleKillOption();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKillStatementRule());
            					}
            					set(
            						current,
            						"kill",
            						lv_kill_0_0,
            						"uk.ac.kcl.inf.group20.docker.Docker.KillOption");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDocker.g:2247:3: ( (otherlv_1= RULE_ID ) )
            // InternalDocker.g:2248:4: (otherlv_1= RULE_ID )
            {
            // InternalDocker.g:2248:4: (otherlv_1= RULE_ID )
            // InternalDocker.g:2249:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKillStatementRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getKillStatementAccess().getContainerNameContainerNameDeclarationCrossReference_1_0());
            				

            }


            }


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
    // $ANTLR end "ruleKillStatement"


    // $ANTLR start "entryRuleRemoveStatement"
    // InternalDocker.g:2264:1: entryRuleRemoveStatement returns [EObject current=null] : iv_ruleRemoveStatement= ruleRemoveStatement EOF ;
    public final EObject entryRuleRemoveStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRemoveStatement = null;


        try {
            // InternalDocker.g:2264:56: (iv_ruleRemoveStatement= ruleRemoveStatement EOF )
            // InternalDocker.g:2265:2: iv_ruleRemoveStatement= ruleRemoveStatement EOF
            {
             newCompositeNode(grammarAccess.getRemoveStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRemoveStatement=ruleRemoveStatement();

            state._fsp--;

             current =iv_ruleRemoveStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRemoveStatement"


    // $ANTLR start "ruleRemoveStatement"
    // InternalDocker.g:2271:1: ruleRemoveStatement returns [EObject current=null] : (otherlv_0= 'remove' ( (lv_rmOptions_1_0= ruleRmOptions ) )? ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleRemoveStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Enumerator lv_rmOptions_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:2277:2: ( (otherlv_0= 'remove' ( (lv_rmOptions_1_0= ruleRmOptions ) )? ( (otherlv_2= RULE_ID ) ) ) )
            // InternalDocker.g:2278:2: (otherlv_0= 'remove' ( (lv_rmOptions_1_0= ruleRmOptions ) )? ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalDocker.g:2278:2: (otherlv_0= 'remove' ( (lv_rmOptions_1_0= ruleRmOptions ) )? ( (otherlv_2= RULE_ID ) ) )
            // InternalDocker.g:2279:3: otherlv_0= 'remove' ( (lv_rmOptions_1_0= ruleRmOptions ) )? ( (otherlv_2= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_21); 

            			newLeafNode(otherlv_0, grammarAccess.getRemoveStatementAccess().getRemoveKeyword_0());
            		
            // InternalDocker.g:2283:3: ( (lv_rmOptions_1_0= ruleRmOptions ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==67||(LA18_0>=78 && LA18_0<=80)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDocker.g:2284:4: (lv_rmOptions_1_0= ruleRmOptions )
                    {
                    // InternalDocker.g:2284:4: (lv_rmOptions_1_0= ruleRmOptions )
                    // InternalDocker.g:2285:5: lv_rmOptions_1_0= ruleRmOptions
                    {

                    					newCompositeNode(grammarAccess.getRemoveStatementAccess().getRmOptionsRmOptionsEnumRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_rmOptions_1_0=ruleRmOptions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getRemoveStatementRule());
                    					}
                    					set(
                    						current,
                    						"rmOptions",
                    						lv_rmOptions_1_0,
                    						"uk.ac.kcl.inf.group20.docker.Docker.RmOptions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalDocker.g:2302:3: ( (otherlv_2= RULE_ID ) )
            // InternalDocker.g:2303:4: (otherlv_2= RULE_ID )
            {
            // InternalDocker.g:2303:4: (otherlv_2= RULE_ID )
            // InternalDocker.g:2304:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRemoveStatementRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_2, grammarAccess.getRemoveStatementAccess().getContainerNameContainerNameDeclarationCrossReference_2_0());
            				

            }


            }


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
    // $ANTLR end "ruleRemoveStatement"


    // $ANTLR start "entryRuleRunCreateStatement"
    // InternalDocker.g:2319:1: entryRuleRunCreateStatement returns [EObject current=null] : iv_ruleRunCreateStatement= ruleRunCreateStatement EOF ;
    public final EObject entryRuleRunCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunCreateStatement = null;


        try {
            // InternalDocker.g:2319:59: (iv_ruleRunCreateStatement= ruleRunCreateStatement EOF )
            // InternalDocker.g:2320:2: iv_ruleRunCreateStatement= ruleRunCreateStatement EOF
            {
             newCompositeNode(grammarAccess.getRunCreateStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunCreateStatement=ruleRunCreateStatement();

            state._fsp--;

             current =iv_ruleRunCreateStatement; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRunCreateStatement"


    // $ANTLR start "ruleRunCreateStatement"
    // InternalDocker.g:2326:1: ruleRunCreateStatement returns [EObject current=null] : ( ( (lv_order_0_0= ruleRunorCreate ) ) ( (lv_runOptions_1_0= ruleRunOption ) )* ( (lv_image_2_0= ruleImage ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleRunCreateStatement() throws RecognitionException {
        EObject current = null;

        Token lv_commands_3_0=null;
        Enumerator lv_order_0_0 = null;

        EObject lv_runOptions_1_0 = null;

        Enumerator lv_image_2_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:2332:2: ( ( ( (lv_order_0_0= ruleRunorCreate ) ) ( (lv_runOptions_1_0= ruleRunOption ) )* ( (lv_image_2_0= ruleImage ) ) ( (lv_commands_3_0= RULE_STRING ) ) ) )
            // InternalDocker.g:2333:2: ( ( (lv_order_0_0= ruleRunorCreate ) ) ( (lv_runOptions_1_0= ruleRunOption ) )* ( (lv_image_2_0= ruleImage ) ) ( (lv_commands_3_0= RULE_STRING ) ) )
            {
            // InternalDocker.g:2333:2: ( ( (lv_order_0_0= ruleRunorCreate ) ) ( (lv_runOptions_1_0= ruleRunOption ) )* ( (lv_image_2_0= ruleImage ) ) ( (lv_commands_3_0= RULE_STRING ) ) )
            // InternalDocker.g:2334:3: ( (lv_order_0_0= ruleRunorCreate ) ) ( (lv_runOptions_1_0= ruleRunOption ) )* ( (lv_image_2_0= ruleImage ) ) ( (lv_commands_3_0= RULE_STRING ) )
            {
            // InternalDocker.g:2334:3: ( (lv_order_0_0= ruleRunorCreate ) )
            // InternalDocker.g:2335:4: (lv_order_0_0= ruleRunorCreate )
            {
            // InternalDocker.g:2335:4: (lv_order_0_0= ruleRunorCreate )
            // InternalDocker.g:2336:5: lv_order_0_0= ruleRunorCreate
            {

            					newCompositeNode(grammarAccess.getRunCreateStatementAccess().getOrderRunorCreateEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_22);
            lv_order_0_0=ruleRunorCreate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunCreateStatementRule());
            					}
            					set(
            						current,
            						"order",
            						lv_order_0_0,
            						"uk.ac.kcl.inf.group20.docker.Docker.RunorCreate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDocker.g:2353:3: ( (lv_runOptions_1_0= ruleRunOption ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=53 && LA19_0<=62)||(LA19_0>=64 && LA19_0<=65)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalDocker.g:2354:4: (lv_runOptions_1_0= ruleRunOption )
            	    {
            	    // InternalDocker.g:2354:4: (lv_runOptions_1_0= ruleRunOption )
            	    // InternalDocker.g:2355:5: lv_runOptions_1_0= ruleRunOption
            	    {

            	    					newCompositeNode(grammarAccess.getRunCreateStatementAccess().getRunOptionsRunOptionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_runOptions_1_0=ruleRunOption();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRunCreateStatementRule());
            	    					}
            	    					add(
            	    						current,
            	    						"runOptions",
            	    						lv_runOptions_1_0,
            	    						"uk.ac.kcl.inf.group20.docker.Docker.RunOption");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalDocker.g:2372:3: ( (lv_image_2_0= ruleImage ) )
            // InternalDocker.g:2373:4: (lv_image_2_0= ruleImage )
            {
            // InternalDocker.g:2373:4: (lv_image_2_0= ruleImage )
            // InternalDocker.g:2374:5: lv_image_2_0= ruleImage
            {

            					newCompositeNode(grammarAccess.getRunCreateStatementAccess().getImageImageEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_image_2_0=ruleImage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRunCreateStatementRule());
            					}
            					set(
            						current,
            						"image",
            						lv_image_2_0,
            						"uk.ac.kcl.inf.group20.docker.Docker.Image");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalDocker.g:2391:3: ( (lv_commands_3_0= RULE_STRING ) )
            // InternalDocker.g:2392:4: (lv_commands_3_0= RULE_STRING )
            {
            // InternalDocker.g:2392:4: (lv_commands_3_0= RULE_STRING )
            // InternalDocker.g:2393:5: lv_commands_3_0= RULE_STRING
            {
            lv_commands_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_commands_3_0, grammarAccess.getRunCreateStatementAccess().getCommandsSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRunCreateStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"commands",
            						lv_commands_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


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
    // $ANTLR end "ruleRunCreateStatement"


    // $ANTLR start "entryRuleRunOption"
    // InternalDocker.g:2413:1: entryRuleRunOption returns [EObject current=null] : iv_ruleRunOption= ruleRunOption EOF ;
    public final EObject entryRuleRunOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRunOption = null;


        try {
            // InternalDocker.g:2413:50: (iv_ruleRunOption= ruleRunOption EOF )
            // InternalDocker.g:2414:2: iv_ruleRunOption= ruleRunOption EOF
            {
             newCompositeNode(grammarAccess.getRunOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRunOption=ruleRunOption();

            state._fsp--;

             current =iv_ruleRunOption; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRunOption"


    // $ANTLR start "ruleRunOption"
    // InternalDocker.g:2420:1: ruleRunOption returns [EObject current=null] : ( ( ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) ) ) | ( () ( (lv_condition_3_0= 'backstage' ) ) ) | ( () ( (lv_condition_5_0= 'interface' ) ) ) | ( () ( (lv_condition_7_0= 'random_port' ) ) ) | ( ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) ) ) | ( () ( (lv_condition_11_0= 'terminate' ) ) ) | ( ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) ) ) | ( ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) ) ) | ( ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) ) ) | ( ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) ) ) | ( ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) ) ) | ( ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) ) ) ) ;
    public final EObject ruleRunOption() throws RecognitionException {
        EObject current = null;

        Token lv_condition_0_0=null;
        Token lv_condition_3_0=null;
        Token lv_condition_5_0=null;
        Token lv_condition_7_0=null;
        Token lv_condition_8_0=null;
        Token lv_portName_9_0=null;
        Token lv_condition_11_0=null;
        Token lv_condition_12_0=null;
        Token lv_server_13_0=null;
        Token lv_condition_14_0=null;
        Token lv_domainName_15_0=null;
        Token lv_condition_16_0=null;
        Token lv_hostname_17_0=null;
        Token lv_condition_18_0=null;
        Token lv_environmentVariable_19_0=null;
        Token otherlv_20=null;
        Token lv_setEnvironmentVariable_21_0=null;
        Token lv_condition_22_0=null;
        Token lv_connectType_23_0=null;
        Token lv_condition_24_0=null;
        Token otherlv_25=null;
        Enumerator lv_outType_1_0 = null;



        	enterRule();

        try {
            // InternalDocker.g:2426:2: ( ( ( ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) ) ) | ( () ( (lv_condition_3_0= 'backstage' ) ) ) | ( () ( (lv_condition_5_0= 'interface' ) ) ) | ( () ( (lv_condition_7_0= 'random_port' ) ) ) | ( ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) ) ) | ( () ( (lv_condition_11_0= 'terminate' ) ) ) | ( ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) ) ) | ( ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) ) ) | ( ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) ) ) | ( ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) ) ) | ( ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) ) ) | ( ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) ) ) ) )
            // InternalDocker.g:2427:2: ( ( ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) ) ) | ( () ( (lv_condition_3_0= 'backstage' ) ) ) | ( () ( (lv_condition_5_0= 'interface' ) ) ) | ( () ( (lv_condition_7_0= 'random_port' ) ) ) | ( ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) ) ) | ( () ( (lv_condition_11_0= 'terminate' ) ) ) | ( ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) ) ) | ( ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) ) ) | ( ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) ) ) | ( ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) ) ) | ( ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) ) ) | ( ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) ) ) )
            {
            // InternalDocker.g:2427:2: ( ( ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) ) ) | ( () ( (lv_condition_3_0= 'backstage' ) ) ) | ( () ( (lv_condition_5_0= 'interface' ) ) ) | ( () ( (lv_condition_7_0= 'random_port' ) ) ) | ( ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) ) ) | ( () ( (lv_condition_11_0= 'terminate' ) ) ) | ( ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) ) ) | ( ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) ) ) | ( ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) ) ) | ( ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) ) ) | ( ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) ) ) | ( ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) ) ) )
            int alt20=12;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt20=1;
                }
                break;
            case 54:
                {
                alt20=2;
                }
                break;
            case 55:
                {
                alt20=3;
                }
                break;
            case 56:
                {
                alt20=4;
                }
                break;
            case 57:
                {
                alt20=5;
                }
                break;
            case 58:
                {
                alt20=6;
                }
                break;
            case 59:
                {
                alt20=7;
                }
                break;
            case 60:
                {
                alt20=8;
                }
                break;
            case 61:
                {
                alt20=9;
                }
                break;
            case 62:
                {
                alt20=10;
                }
                break;
            case 64:
                {
                alt20=11;
                }
                break;
            case 65:
                {
                alt20=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalDocker.g:2428:3: ( ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) ) )
                    {
                    // InternalDocker.g:2428:3: ( ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) ) )
                    // InternalDocker.g:2429:4: ( (lv_condition_0_0= 'standard' ) ) ( (lv_outType_1_0= ruleOutType ) )
                    {
                    // InternalDocker.g:2429:4: ( (lv_condition_0_0= 'standard' ) )
                    // InternalDocker.g:2430:5: (lv_condition_0_0= 'standard' )
                    {
                    // InternalDocker.g:2430:5: (lv_condition_0_0= 'standard' )
                    // InternalDocker.g:2431:6: lv_condition_0_0= 'standard'
                    {
                    lv_condition_0_0=(Token)match(input,53,FOLLOW_23); 

                    						newLeafNode(lv_condition_0_0, grammarAccess.getRunOptionAccess().getConditionStandardKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_0_0, "standard");
                    					

                    }


                    }

                    // InternalDocker.g:2443:4: ( (lv_outType_1_0= ruleOutType ) )
                    // InternalDocker.g:2444:5: (lv_outType_1_0= ruleOutType )
                    {
                    // InternalDocker.g:2444:5: (lv_outType_1_0= ruleOutType )
                    // InternalDocker.g:2445:6: lv_outType_1_0= ruleOutType
                    {

                    						newCompositeNode(grammarAccess.getRunOptionAccess().getOutTypeOutTypeEnumRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_outType_1_0=ruleOutType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRunOptionRule());
                    						}
                    						set(
                    							current,
                    							"outType",
                    							lv_outType_1_0,
                    							"uk.ac.kcl.inf.group20.docker.Docker.OutType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:2464:3: ( () ( (lv_condition_3_0= 'backstage' ) ) )
                    {
                    // InternalDocker.g:2464:3: ( () ( (lv_condition_3_0= 'backstage' ) ) )
                    // InternalDocker.g:2465:4: () ( (lv_condition_3_0= 'backstage' ) )
                    {
                    // InternalDocker.g:2465:4: ()
                    // InternalDocker.g:2466:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRunOptionAccess().getRunOptionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:2472:4: ( (lv_condition_3_0= 'backstage' ) )
                    // InternalDocker.g:2473:5: (lv_condition_3_0= 'backstage' )
                    {
                    // InternalDocker.g:2473:5: (lv_condition_3_0= 'backstage' )
                    // InternalDocker.g:2474:6: lv_condition_3_0= 'backstage'
                    {
                    lv_condition_3_0=(Token)match(input,54,FOLLOW_2); 

                    						newLeafNode(lv_condition_3_0, grammarAccess.getRunOptionAccess().getConditionBackstageKeyword_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_3_0, "backstage");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:2488:3: ( () ( (lv_condition_5_0= 'interface' ) ) )
                    {
                    // InternalDocker.g:2488:3: ( () ( (lv_condition_5_0= 'interface' ) ) )
                    // InternalDocker.g:2489:4: () ( (lv_condition_5_0= 'interface' ) )
                    {
                    // InternalDocker.g:2489:4: ()
                    // InternalDocker.g:2490:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRunOptionAccess().getRunOptionAction_2_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:2496:4: ( (lv_condition_5_0= 'interface' ) )
                    // InternalDocker.g:2497:5: (lv_condition_5_0= 'interface' )
                    {
                    // InternalDocker.g:2497:5: (lv_condition_5_0= 'interface' )
                    // InternalDocker.g:2498:6: lv_condition_5_0= 'interface'
                    {
                    lv_condition_5_0=(Token)match(input,55,FOLLOW_2); 

                    						newLeafNode(lv_condition_5_0, grammarAccess.getRunOptionAccess().getConditionInterfaceKeyword_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_5_0, "interface");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:2512:3: ( () ( (lv_condition_7_0= 'random_port' ) ) )
                    {
                    // InternalDocker.g:2512:3: ( () ( (lv_condition_7_0= 'random_port' ) ) )
                    // InternalDocker.g:2513:4: () ( (lv_condition_7_0= 'random_port' ) )
                    {
                    // InternalDocker.g:2513:4: ()
                    // InternalDocker.g:2514:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRunOptionAccess().getRunOptionAction_3_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:2520:4: ( (lv_condition_7_0= 'random_port' ) )
                    // InternalDocker.g:2521:5: (lv_condition_7_0= 'random_port' )
                    {
                    // InternalDocker.g:2521:5: (lv_condition_7_0= 'random_port' )
                    // InternalDocker.g:2522:6: lv_condition_7_0= 'random_port'
                    {
                    lv_condition_7_0=(Token)match(input,56,FOLLOW_2); 

                    						newLeafNode(lv_condition_7_0, grammarAccess.getRunOptionAccess().getConditionRandom_portKeyword_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_7_0, "random_port");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalDocker.g:2536:3: ( ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:2536:3: ( ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) ) )
                    // InternalDocker.g:2537:4: ( (lv_condition_8_0= 'specify_port' ) ) ( (lv_portName_9_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:2537:4: ( (lv_condition_8_0= 'specify_port' ) )
                    // InternalDocker.g:2538:5: (lv_condition_8_0= 'specify_port' )
                    {
                    // InternalDocker.g:2538:5: (lv_condition_8_0= 'specify_port' )
                    // InternalDocker.g:2539:6: lv_condition_8_0= 'specify_port'
                    {
                    lv_condition_8_0=(Token)match(input,57,FOLLOW_6); 

                    						newLeafNode(lv_condition_8_0, grammarAccess.getRunOptionAccess().getConditionSpecify_portKeyword_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_8_0, "specify_port");
                    					

                    }


                    }

                    // InternalDocker.g:2551:4: ( (lv_portName_9_0= RULE_STRING ) )
                    // InternalDocker.g:2552:5: (lv_portName_9_0= RULE_STRING )
                    {
                    // InternalDocker.g:2552:5: (lv_portName_9_0= RULE_STRING )
                    // InternalDocker.g:2553:6: lv_portName_9_0= RULE_STRING
                    {
                    lv_portName_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_portName_9_0, grammarAccess.getRunOptionAccess().getPortNameSTRINGTerminalRuleCall_4_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"portName",
                    							lv_portName_9_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalDocker.g:2571:3: ( () ( (lv_condition_11_0= 'terminate' ) ) )
                    {
                    // InternalDocker.g:2571:3: ( () ( (lv_condition_11_0= 'terminate' ) ) )
                    // InternalDocker.g:2572:4: () ( (lv_condition_11_0= 'terminate' ) )
                    {
                    // InternalDocker.g:2572:4: ()
                    // InternalDocker.g:2573:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getRunOptionAccess().getRunOptionAction_5_0(),
                    						current);
                    				

                    }

                    // InternalDocker.g:2579:4: ( (lv_condition_11_0= 'terminate' ) )
                    // InternalDocker.g:2580:5: (lv_condition_11_0= 'terminate' )
                    {
                    // InternalDocker.g:2580:5: (lv_condition_11_0= 'terminate' )
                    // InternalDocker.g:2581:6: lv_condition_11_0= 'terminate'
                    {
                    lv_condition_11_0=(Token)match(input,58,FOLLOW_2); 

                    						newLeafNode(lv_condition_11_0, grammarAccess.getRunOptionAccess().getConditionTerminateKeyword_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_11_0, "terminate");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalDocker.g:2595:3: ( ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:2595:3: ( ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) ) )
                    // InternalDocker.g:2596:4: ( (lv_condition_12_0= 'DNS' ) ) ( (lv_server_13_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:2596:4: ( (lv_condition_12_0= 'DNS' ) )
                    // InternalDocker.g:2597:5: (lv_condition_12_0= 'DNS' )
                    {
                    // InternalDocker.g:2597:5: (lv_condition_12_0= 'DNS' )
                    // InternalDocker.g:2598:6: lv_condition_12_0= 'DNS'
                    {
                    lv_condition_12_0=(Token)match(input,59,FOLLOW_6); 

                    						newLeafNode(lv_condition_12_0, grammarAccess.getRunOptionAccess().getConditionDNSKeyword_6_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_12_0, "DNS");
                    					

                    }


                    }

                    // InternalDocker.g:2610:4: ( (lv_server_13_0= RULE_STRING ) )
                    // InternalDocker.g:2611:5: (lv_server_13_0= RULE_STRING )
                    {
                    // InternalDocker.g:2611:5: (lv_server_13_0= RULE_STRING )
                    // InternalDocker.g:2612:6: lv_server_13_0= RULE_STRING
                    {
                    lv_server_13_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_server_13_0, grammarAccess.getRunOptionAccess().getServerSTRINGTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"server",
                    							lv_server_13_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalDocker.g:2630:3: ( ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:2630:3: ( ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) ) )
                    // InternalDocker.g:2631:4: ( (lv_condition_14_0= 'search_DNS' ) ) ( (lv_domainName_15_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:2631:4: ( (lv_condition_14_0= 'search_DNS' ) )
                    // InternalDocker.g:2632:5: (lv_condition_14_0= 'search_DNS' )
                    {
                    // InternalDocker.g:2632:5: (lv_condition_14_0= 'search_DNS' )
                    // InternalDocker.g:2633:6: lv_condition_14_0= 'search_DNS'
                    {
                    lv_condition_14_0=(Token)match(input,60,FOLLOW_6); 

                    						newLeafNode(lv_condition_14_0, grammarAccess.getRunOptionAccess().getConditionSearch_DNSKeyword_7_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_14_0, "search_DNS");
                    					

                    }


                    }

                    // InternalDocker.g:2645:4: ( (lv_domainName_15_0= RULE_STRING ) )
                    // InternalDocker.g:2646:5: (lv_domainName_15_0= RULE_STRING )
                    {
                    // InternalDocker.g:2646:5: (lv_domainName_15_0= RULE_STRING )
                    // InternalDocker.g:2647:6: lv_domainName_15_0= RULE_STRING
                    {
                    lv_domainName_15_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_domainName_15_0, grammarAccess.getRunOptionAccess().getDomainNameSTRINGTerminalRuleCall_7_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"domainName",
                    							lv_domainName_15_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalDocker.g:2665:3: ( ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:2665:3: ( ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) ) )
                    // InternalDocker.g:2666:4: ( (lv_condition_16_0= 'hostname' ) ) ( (lv_hostname_17_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:2666:4: ( (lv_condition_16_0= 'hostname' ) )
                    // InternalDocker.g:2667:5: (lv_condition_16_0= 'hostname' )
                    {
                    // InternalDocker.g:2667:5: (lv_condition_16_0= 'hostname' )
                    // InternalDocker.g:2668:6: lv_condition_16_0= 'hostname'
                    {
                    lv_condition_16_0=(Token)match(input,61,FOLLOW_6); 

                    						newLeafNode(lv_condition_16_0, grammarAccess.getRunOptionAccess().getConditionHostnameKeyword_8_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_16_0, "hostname");
                    					

                    }


                    }

                    // InternalDocker.g:2680:4: ( (lv_hostname_17_0= RULE_STRING ) )
                    // InternalDocker.g:2681:5: (lv_hostname_17_0= RULE_STRING )
                    {
                    // InternalDocker.g:2681:5: (lv_hostname_17_0= RULE_STRING )
                    // InternalDocker.g:2682:6: lv_hostname_17_0= RULE_STRING
                    {
                    lv_hostname_17_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_hostname_17_0, grammarAccess.getRunOptionAccess().getHostnameSTRINGTerminalRuleCall_8_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"hostname",
                    							lv_hostname_17_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalDocker.g:2700:3: ( ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:2700:3: ( ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) ) )
                    // InternalDocker.g:2701:4: ( (lv_condition_18_0= 'environment' ) ) ( (lv_environmentVariable_19_0= RULE_STRING ) ) otherlv_20= '=' ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:2701:4: ( (lv_condition_18_0= 'environment' ) )
                    // InternalDocker.g:2702:5: (lv_condition_18_0= 'environment' )
                    {
                    // InternalDocker.g:2702:5: (lv_condition_18_0= 'environment' )
                    // InternalDocker.g:2703:6: lv_condition_18_0= 'environment'
                    {
                    lv_condition_18_0=(Token)match(input,62,FOLLOW_6); 

                    						newLeafNode(lv_condition_18_0, grammarAccess.getRunOptionAccess().getConditionEnvironmentKeyword_9_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_18_0, "environment");
                    					

                    }


                    }

                    // InternalDocker.g:2715:4: ( (lv_environmentVariable_19_0= RULE_STRING ) )
                    // InternalDocker.g:2716:5: (lv_environmentVariable_19_0= RULE_STRING )
                    {
                    // InternalDocker.g:2716:5: (lv_environmentVariable_19_0= RULE_STRING )
                    // InternalDocker.g:2717:6: lv_environmentVariable_19_0= RULE_STRING
                    {
                    lv_environmentVariable_19_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

                    						newLeafNode(lv_environmentVariable_19_0, grammarAccess.getRunOptionAccess().getEnvironmentVariableSTRINGTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"environmentVariable",
                    							lv_environmentVariable_19_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,63,FOLLOW_6); 

                    				newLeafNode(otherlv_20, grammarAccess.getRunOptionAccess().getEqualsSignKeyword_9_2());
                    			
                    // InternalDocker.g:2737:4: ( (lv_setEnvironmentVariable_21_0= RULE_STRING ) )
                    // InternalDocker.g:2738:5: (lv_setEnvironmentVariable_21_0= RULE_STRING )
                    {
                    // InternalDocker.g:2738:5: (lv_setEnvironmentVariable_21_0= RULE_STRING )
                    // InternalDocker.g:2739:6: lv_setEnvironmentVariable_21_0= RULE_STRING
                    {
                    lv_setEnvironmentVariable_21_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_setEnvironmentVariable_21_0, grammarAccess.getRunOptionAccess().getSetEnvironmentVariableSTRINGTerminalRuleCall_9_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"setEnvironmentVariable",
                    							lv_setEnvironmentVariable_21_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalDocker.g:2757:3: ( ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) ) )
                    {
                    // InternalDocker.g:2757:3: ( ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) ) )
                    // InternalDocker.g:2758:4: ( (lv_condition_22_0= 'network' ) ) ( (lv_connectType_23_0= RULE_STRING ) )
                    {
                    // InternalDocker.g:2758:4: ( (lv_condition_22_0= 'network' ) )
                    // InternalDocker.g:2759:5: (lv_condition_22_0= 'network' )
                    {
                    // InternalDocker.g:2759:5: (lv_condition_22_0= 'network' )
                    // InternalDocker.g:2760:6: lv_condition_22_0= 'network'
                    {
                    lv_condition_22_0=(Token)match(input,64,FOLLOW_6); 

                    						newLeafNode(lv_condition_22_0, grammarAccess.getRunOptionAccess().getConditionNetworkKeyword_10_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_22_0, "network");
                    					

                    }


                    }

                    // InternalDocker.g:2772:4: ( (lv_connectType_23_0= RULE_STRING ) )
                    // InternalDocker.g:2773:5: (lv_connectType_23_0= RULE_STRING )
                    {
                    // InternalDocker.g:2773:5: (lv_connectType_23_0= RULE_STRING )
                    // InternalDocker.g:2774:6: lv_connectType_23_0= RULE_STRING
                    {
                    lv_connectType_23_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_connectType_23_0, grammarAccess.getRunOptionAccess().getConnectTypeSTRINGTerminalRuleCall_10_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"connectType",
                    							lv_connectType_23_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalDocker.g:2792:3: ( ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) ) )
                    {
                    // InternalDocker.g:2792:3: ( ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) ) )
                    // InternalDocker.g:2793:4: ( (lv_condition_24_0= 'name' ) ) ( (otherlv_25= RULE_ID ) )
                    {
                    // InternalDocker.g:2793:4: ( (lv_condition_24_0= 'name' ) )
                    // InternalDocker.g:2794:5: (lv_condition_24_0= 'name' )
                    {
                    // InternalDocker.g:2794:5: (lv_condition_24_0= 'name' )
                    // InternalDocker.g:2795:6: lv_condition_24_0= 'name'
                    {
                    lv_condition_24_0=(Token)match(input,65,FOLLOW_7); 

                    						newLeafNode(lv_condition_24_0, grammarAccess.getRunOptionAccess().getConditionNameKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    						setWithLastConsumed(current, "condition", lv_condition_24_0, "name");
                    					

                    }


                    }

                    // InternalDocker.g:2807:4: ( (otherlv_25= RULE_ID ) )
                    // InternalDocker.g:2808:5: (otherlv_25= RULE_ID )
                    {
                    // InternalDocker.g:2808:5: (otherlv_25= RULE_ID )
                    // InternalDocker.g:2809:6: otherlv_25= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRunOptionRule());
                    						}
                    					
                    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_25, grammarAccess.getRunOptionAccess().getContainerNameContainerNameDeclarationCrossReference_11_1_0());
                    					

                    }


                    }


                    }


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
    // $ANTLR end "ruleRunOption"


    // $ANTLR start "entryRuleContainerNameDeclaration"
    // InternalDocker.g:2825:1: entryRuleContainerNameDeclaration returns [EObject current=null] : iv_ruleContainerNameDeclaration= ruleContainerNameDeclaration EOF ;
    public final EObject entryRuleContainerNameDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerNameDeclaration = null;


        try {
            // InternalDocker.g:2825:65: (iv_ruleContainerNameDeclaration= ruleContainerNameDeclaration EOF )
            // InternalDocker.g:2826:2: iv_ruleContainerNameDeclaration= ruleContainerNameDeclaration EOF
            {
             newCompositeNode(grammarAccess.getContainerNameDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContainerNameDeclaration=ruleContainerNameDeclaration();

            state._fsp--;

             current =iv_ruleContainerNameDeclaration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContainerNameDeclaration"


    // $ANTLR start "ruleContainerNameDeclaration"
    // InternalDocker.g:2832:1: ruleContainerNameDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleContainerNameDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalDocker.g:2838:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalDocker.g:2839:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalDocker.g:2839:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalDocker.g:2840:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getContainerNameDeclarationAccess().getVarKeyword_0());
            		
            // InternalDocker.g:2844:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalDocker.g:2845:4: (lv_name_1_0= RULE_ID )
            {
            // InternalDocker.g:2845:4: (lv_name_1_0= RULE_ID )
            // InternalDocker.g:2846:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContainerNameDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContainerNameDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


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
    // $ANTLR end "ruleContainerNameDeclaration"


    // $ANTLR start "ruleRemoveImageOptions"
    // InternalDocker.g:2866:1: ruleRemoveImageOptions returns [Enumerator current=null] : ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'no_remove_process_image' ) ) ;
    public final Enumerator ruleRemoveImageOptions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2872:2: ( ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'no_remove_process_image' ) ) )
            // InternalDocker.g:2873:2: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'no_remove_process_image' ) )
            {
            // InternalDocker.g:2873:2: ( (enumLiteral_0= 'force' ) | (enumLiteral_1= 'no_remove_process_image' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==67) ) {
                alt21=1;
            }
            else if ( (LA21_0==68) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalDocker.g:2874:3: (enumLiteral_0= 'force' )
                    {
                    // InternalDocker.g:2874:3: (enumLiteral_0= 'force' )
                    // InternalDocker.g:2875:4: enumLiteral_0= 'force'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRemoveImageOptionsAccess().getForceEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRemoveImageOptionsAccess().getForceEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:2882:3: (enumLiteral_1= 'no_remove_process_image' )
                    {
                    // InternalDocker.g:2882:3: (enumLiteral_1= 'no_remove_process_image' )
                    // InternalDocker.g:2883:4: enumLiteral_1= 'no_remove_process_image'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getRemoveImageOptionsAccess().getNo_remove_process_imageEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRemoveImageOptionsAccess().getNo_remove_process_imageEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleRemoveImageOptions"


    // $ANTLR start "ruleLinkOption"
    // InternalDocker.g:2893:1: ruleLinkOption returns [Enumerator current=null] : ( (enumLiteral_0= 'no_maintain_link' ) | (enumLiteral_1= 'maintain_link' ) ) ;
    public final Enumerator ruleLinkOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDocker.g:2899:2: ( ( (enumLiteral_0= 'no_maintain_link' ) | (enumLiteral_1= 'maintain_link' ) ) )
            // InternalDocker.g:2900:2: ( (enumLiteral_0= 'no_maintain_link' ) | (enumLiteral_1= 'maintain_link' ) )
            {
            // InternalDocker.g:2900:2: ( (enumLiteral_0= 'no_maintain_link' ) | (enumLiteral_1= 'maintain_link' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==69) ) {
                alt22=1;
            }
            else if ( (LA22_0==70) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalDocker.g:2901:3: (enumLiteral_0= 'no_maintain_link' )
                    {
                    // InternalDocker.g:2901:3: (enumLiteral_0= 'no_maintain_link' )
                    // InternalDocker.g:2902:4: enumLiteral_0= 'no_maintain_link'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getLinkOptionAccess().getNo_maintain_linkEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLinkOptionAccess().getNo_maintain_linkEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:2909:3: (enumLiteral_1= 'maintain_link' )
                    {
                    // InternalDocker.g:2909:3: (enumLiteral_1= 'maintain_link' )
                    // InternalDocker.g:2910:4: enumLiteral_1= 'maintain_link'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getLinkOptionAccess().getMaintain_linkEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLinkOptionAccess().getMaintain_linkEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleLinkOption"


    // $ANTLR start "ruleAttachOption"
    // InternalDocker.g:2920:1: ruleAttachOption returns [Enumerator current=null] : ( (enumLiteral_0= 'detach_keys' ) | (enumLiteral_1= 'no_stdin' ) | (enumLiteral_2= 'sig_proxy_true' ) | (enumLiteral_3= 'sig_proxy_false' ) ) ;
    public final Enumerator ruleAttachOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDocker.g:2926:2: ( ( (enumLiteral_0= 'detach_keys' ) | (enumLiteral_1= 'no_stdin' ) | (enumLiteral_2= 'sig_proxy_true' ) | (enumLiteral_3= 'sig_proxy_false' ) ) )
            // InternalDocker.g:2927:2: ( (enumLiteral_0= 'detach_keys' ) | (enumLiteral_1= 'no_stdin' ) | (enumLiteral_2= 'sig_proxy_true' ) | (enumLiteral_3= 'sig_proxy_false' ) )
            {
            // InternalDocker.g:2927:2: ( (enumLiteral_0= 'detach_keys' ) | (enumLiteral_1= 'no_stdin' ) | (enumLiteral_2= 'sig_proxy_true' ) | (enumLiteral_3= 'sig_proxy_false' ) )
            int alt23=4;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt23=1;
                }
                break;
            case 72:
                {
                alt23=2;
                }
                break;
            case 73:
                {
                alt23=3;
                }
                break;
            case 74:
                {
                alt23=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalDocker.g:2928:3: (enumLiteral_0= 'detach_keys' )
                    {
                    // InternalDocker.g:2928:3: (enumLiteral_0= 'detach_keys' )
                    // InternalDocker.g:2929:4: enumLiteral_0= 'detach_keys'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getAttachOptionAccess().getDetach_keysEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAttachOptionAccess().getDetach_keysEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:2936:3: (enumLiteral_1= 'no_stdin' )
                    {
                    // InternalDocker.g:2936:3: (enumLiteral_1= 'no_stdin' )
                    // InternalDocker.g:2937:4: enumLiteral_1= 'no_stdin'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getAttachOptionAccess().getNo_stdinEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAttachOptionAccess().getNo_stdinEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:2944:3: (enumLiteral_2= 'sig_proxy_true' )
                    {
                    // InternalDocker.g:2944:3: (enumLiteral_2= 'sig_proxy_true' )
                    // InternalDocker.g:2945:4: enumLiteral_2= 'sig_proxy_true'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getAttachOptionAccess().getSig_proxy_trueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAttachOptionAccess().getSig_proxy_trueEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:2952:3: (enumLiteral_3= 'sig_proxy_false' )
                    {
                    // InternalDocker.g:2952:3: (enumLiteral_3= 'sig_proxy_false' )
                    // InternalDocker.g:2953:4: enumLiteral_3= 'sig_proxy_false'
                    {
                    enumLiteral_3=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getAttachOptionAccess().getSig_proxy_falseEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getAttachOptionAccess().getSig_proxy_falseEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleAttachOption"


    // $ANTLR start "ruleExecOption"
    // InternalDocker.g:2963:1: ruleExecOption returns [Enumerator current=null] : ( (enumLiteral_0= 'backstage' ) | (enumLiteral_1= 'open_STDIN' ) | (enumLiteral_2= 'terminate' ) ) ;
    public final Enumerator ruleExecOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDocker.g:2969:2: ( ( (enumLiteral_0= 'backstage' ) | (enumLiteral_1= 'open_STDIN' ) | (enumLiteral_2= 'terminate' ) ) )
            // InternalDocker.g:2970:2: ( (enumLiteral_0= 'backstage' ) | (enumLiteral_1= 'open_STDIN' ) | (enumLiteral_2= 'terminate' ) )
            {
            // InternalDocker.g:2970:2: ( (enumLiteral_0= 'backstage' ) | (enumLiteral_1= 'open_STDIN' ) | (enumLiteral_2= 'terminate' ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt24=1;
                }
                break;
            case 75:
                {
                alt24=2;
                }
                break;
            case 58:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalDocker.g:2971:3: (enumLiteral_0= 'backstage' )
                    {
                    // InternalDocker.g:2971:3: (enumLiteral_0= 'backstage' )
                    // InternalDocker.g:2972:4: enumLiteral_0= 'backstage'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getExecOptionAccess().getBackstageEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getExecOptionAccess().getBackstageEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:2979:3: (enumLiteral_1= 'open_STDIN' )
                    {
                    // InternalDocker.g:2979:3: (enumLiteral_1= 'open_STDIN' )
                    // InternalDocker.g:2980:4: enumLiteral_1= 'open_STDIN'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getExecOptionAccess().getOpen_STDINEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getExecOptionAccess().getOpen_STDINEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:2987:3: (enumLiteral_2= 'terminate' )
                    {
                    // InternalDocker.g:2987:3: (enumLiteral_2= 'terminate' )
                    // InternalDocker.g:2988:4: enumLiteral_2= 'terminate'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getExecOptionAccess().getTerminateEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getExecOptionAccess().getTerminateEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleExecOption"


    // $ANTLR start "ruleKillOption"
    // InternalDocker.g:2998:1: ruleKillOption returns [Enumerator current=null] : ( (enumLiteral_0= 'kill' ) | (enumLiteral_1= 'kill_sign' ) ) ;
    public final Enumerator ruleKillOption() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDocker.g:3004:2: ( ( (enumLiteral_0= 'kill' ) | (enumLiteral_1= 'kill_sign' ) ) )
            // InternalDocker.g:3005:2: ( (enumLiteral_0= 'kill' ) | (enumLiteral_1= 'kill_sign' ) )
            {
            // InternalDocker.g:3005:2: ( (enumLiteral_0= 'kill' ) | (enumLiteral_1= 'kill_sign' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==76) ) {
                alt25=1;
            }
            else if ( (LA25_0==77) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalDocker.g:3006:3: (enumLiteral_0= 'kill' )
                    {
                    // InternalDocker.g:3006:3: (enumLiteral_0= 'kill' )
                    // InternalDocker.g:3007:4: enumLiteral_0= 'kill'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getKillOptionAccess().getKillEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKillOptionAccess().getKillEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:3014:3: (enumLiteral_1= 'kill_sign' )
                    {
                    // InternalDocker.g:3014:3: (enumLiteral_1= 'kill_sign' )
                    // InternalDocker.g:3015:4: enumLiteral_1= 'kill_sign'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getKillOptionAccess().getKill_signEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKillOptionAccess().getKill_signEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleKillOption"


    // $ANTLR start "ruleRmOptions"
    // InternalDocker.g:3025:1: ruleRmOptions returns [Enumerator current=null] : ( (enumLiteral_0= 'no_option' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'delete_link' ) | (enumLiteral_3= 'delete_volume' ) ) ;
    public final Enumerator ruleRmOptions() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalDocker.g:3031:2: ( ( (enumLiteral_0= 'no_option' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'delete_link' ) | (enumLiteral_3= 'delete_volume' ) ) )
            // InternalDocker.g:3032:2: ( (enumLiteral_0= 'no_option' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'delete_link' ) | (enumLiteral_3= 'delete_volume' ) )
            {
            // InternalDocker.g:3032:2: ( (enumLiteral_0= 'no_option' ) | (enumLiteral_1= 'force' ) | (enumLiteral_2= 'delete_link' ) | (enumLiteral_3= 'delete_volume' ) )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt26=1;
                }
                break;
            case 67:
                {
                alt26=2;
                }
                break;
            case 79:
                {
                alt26=3;
                }
                break;
            case 80:
                {
                alt26=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalDocker.g:3033:3: (enumLiteral_0= 'no_option' )
                    {
                    // InternalDocker.g:3033:3: (enumLiteral_0= 'no_option' )
                    // InternalDocker.g:3034:4: enumLiteral_0= 'no_option'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getRmOptionsAccess().getNo_optionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRmOptionsAccess().getNo_optionEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:3041:3: (enumLiteral_1= 'force' )
                    {
                    // InternalDocker.g:3041:3: (enumLiteral_1= 'force' )
                    // InternalDocker.g:3042:4: enumLiteral_1= 'force'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getRmOptionsAccess().getForceEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRmOptionsAccess().getForceEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:3049:3: (enumLiteral_2= 'delete_link' )
                    {
                    // InternalDocker.g:3049:3: (enumLiteral_2= 'delete_link' )
                    // InternalDocker.g:3050:4: enumLiteral_2= 'delete_link'
                    {
                    enumLiteral_2=(Token)match(input,79,FOLLOW_2); 

                    				current = grammarAccess.getRmOptionsAccess().getDelete_linkEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getRmOptionsAccess().getDelete_linkEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:3057:3: (enumLiteral_3= 'delete_volume' )
                    {
                    // InternalDocker.g:3057:3: (enumLiteral_3= 'delete_volume' )
                    // InternalDocker.g:3058:4: enumLiteral_3= 'delete_volume'
                    {
                    enumLiteral_3=(Token)match(input,80,FOLLOW_2); 

                    				current = grammarAccess.getRmOptionsAccess().getDelete_volumeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getRmOptionsAccess().getDelete_volumeEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleRmOptions"


    // $ANTLR start "ruleRunorCreate"
    // InternalDocker.g:3068:1: ruleRunorCreate returns [Enumerator current=null] : ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'create' ) ) ;
    public final Enumerator ruleRunorCreate() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalDocker.g:3074:2: ( ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'create' ) ) )
            // InternalDocker.g:3075:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'create' ) )
            {
            // InternalDocker.g:3075:2: ( (enumLiteral_0= 'run' ) | (enumLiteral_1= 'create' ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==81) ) {
                alt27=1;
            }
            else if ( (LA27_0==23) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalDocker.g:3076:3: (enumLiteral_0= 'run' )
                    {
                    // InternalDocker.g:3076:3: (enumLiteral_0= 'run' )
                    // InternalDocker.g:3077:4: enumLiteral_0= 'run'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_2); 

                    				current = grammarAccess.getRunorCreateAccess().getRunEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getRunorCreateAccess().getRunEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:3084:3: (enumLiteral_1= 'create' )
                    {
                    // InternalDocker.g:3084:3: (enumLiteral_1= 'create' )
                    // InternalDocker.g:3085:4: enumLiteral_1= 'create'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getRunorCreateAccess().getCreateEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getRunorCreateAccess().getCreateEnumLiteralDeclaration_1());
                    			

                    }


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
    // $ANTLR end "ruleRunorCreate"


    // $ANTLR start "ruleImage"
    // InternalDocker.g:3095:1: ruleImage returns [Enumerator current=null] : ( (enumLiteral_0= 'Ubuntu' ) | (enumLiteral_1= 'Centos' ) | (enumLiteral_2= 'Nginx' ) | (enumLiteral_3= 'PHP' ) | (enumLiteral_4= 'Apache' ) ) ;
    public final Enumerator ruleImage() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalDocker.g:3101:2: ( ( (enumLiteral_0= 'Ubuntu' ) | (enumLiteral_1= 'Centos' ) | (enumLiteral_2= 'Nginx' ) | (enumLiteral_3= 'PHP' ) | (enumLiteral_4= 'Apache' ) ) )
            // InternalDocker.g:3102:2: ( (enumLiteral_0= 'Ubuntu' ) | (enumLiteral_1= 'Centos' ) | (enumLiteral_2= 'Nginx' ) | (enumLiteral_3= 'PHP' ) | (enumLiteral_4= 'Apache' ) )
            {
            // InternalDocker.g:3102:2: ( (enumLiteral_0= 'Ubuntu' ) | (enumLiteral_1= 'Centos' ) | (enumLiteral_2= 'Nginx' ) | (enumLiteral_3= 'PHP' ) | (enumLiteral_4= 'Apache' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 82:
                {
                alt28=1;
                }
                break;
            case 83:
                {
                alt28=2;
                }
                break;
            case 84:
                {
                alt28=3;
                }
                break;
            case 85:
                {
                alt28=4;
                }
                break;
            case 86:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalDocker.g:3103:3: (enumLiteral_0= 'Ubuntu' )
                    {
                    // InternalDocker.g:3103:3: (enumLiteral_0= 'Ubuntu' )
                    // InternalDocker.g:3104:4: enumLiteral_0= 'Ubuntu'
                    {
                    enumLiteral_0=(Token)match(input,82,FOLLOW_2); 

                    				current = grammarAccess.getImageAccess().getUbuntuEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getImageAccess().getUbuntuEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:3111:3: (enumLiteral_1= 'Centos' )
                    {
                    // InternalDocker.g:3111:3: (enumLiteral_1= 'Centos' )
                    // InternalDocker.g:3112:4: enumLiteral_1= 'Centos'
                    {
                    enumLiteral_1=(Token)match(input,83,FOLLOW_2); 

                    				current = grammarAccess.getImageAccess().getCentosEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getImageAccess().getCentosEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:3119:3: (enumLiteral_2= 'Nginx' )
                    {
                    // InternalDocker.g:3119:3: (enumLiteral_2= 'Nginx' )
                    // InternalDocker.g:3120:4: enumLiteral_2= 'Nginx'
                    {
                    enumLiteral_2=(Token)match(input,84,FOLLOW_2); 

                    				current = grammarAccess.getImageAccess().getNginxEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getImageAccess().getNginxEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalDocker.g:3127:3: (enumLiteral_3= 'PHP' )
                    {
                    // InternalDocker.g:3127:3: (enumLiteral_3= 'PHP' )
                    // InternalDocker.g:3128:4: enumLiteral_3= 'PHP'
                    {
                    enumLiteral_3=(Token)match(input,85,FOLLOW_2); 

                    				current = grammarAccess.getImageAccess().getPHPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getImageAccess().getPHPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalDocker.g:3135:3: (enumLiteral_4= 'Apache' )
                    {
                    // InternalDocker.g:3135:3: (enumLiteral_4= 'Apache' )
                    // InternalDocker.g:3136:4: enumLiteral_4= 'Apache'
                    {
                    enumLiteral_4=(Token)match(input,86,FOLLOW_2); 

                    				current = grammarAccess.getImageAccess().getApacheEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getImageAccess().getApacheEnumLiteralDeclaration_4());
                    			

                    }


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
    // $ANTLR end "ruleImage"


    // $ANTLR start "ruleOutType"
    // InternalDocker.g:3146:1: ruleOutType returns [Enumerator current=null] : ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) | (enumLiteral_2= 'ERR' ) ) ;
    public final Enumerator ruleOutType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDocker.g:3152:2: ( ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) | (enumLiteral_2= 'ERR' ) ) )
            // InternalDocker.g:3153:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) | (enumLiteral_2= 'ERR' ) )
            {
            // InternalDocker.g:3153:2: ( (enumLiteral_0= 'IN' ) | (enumLiteral_1= 'OUT' ) | (enumLiteral_2= 'ERR' ) )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt29=1;
                }
                break;
            case 88:
                {
                alt29=2;
                }
                break;
            case 89:
                {
                alt29=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalDocker.g:3154:3: (enumLiteral_0= 'IN' )
                    {
                    // InternalDocker.g:3154:3: (enumLiteral_0= 'IN' )
                    // InternalDocker.g:3155:4: enumLiteral_0= 'IN'
                    {
                    enumLiteral_0=(Token)match(input,87,FOLLOW_2); 

                    				current = grammarAccess.getOutTypeAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getOutTypeAccess().getINEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDocker.g:3162:3: (enumLiteral_1= 'OUT' )
                    {
                    // InternalDocker.g:3162:3: (enumLiteral_1= 'OUT' )
                    // InternalDocker.g:3163:4: enumLiteral_1= 'OUT'
                    {
                    enumLiteral_1=(Token)match(input,88,FOLLOW_2); 

                    				current = grammarAccess.getOutTypeAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getOutTypeAccess().getOUTEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDocker.g:3170:3: (enumLiteral_2= 'ERR' )
                    {
                    // InternalDocker.g:3170:3: (enumLiteral_2= 'ERR' )
                    // InternalDocker.g:3171:4: enumLiteral_2= 'ERR'
                    {
                    enumLiteral_2=(Token)match(input,89,FOLLOW_2); 

                    				current = grammarAccess.getOutTypeAccess().getERREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getOutTypeAccess().getERREnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleOutType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x001FC1343CB81802L,0x0000000000023004L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000018L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000007E010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003C00020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000003C0000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000880008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000880008002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000780L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000C000010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000C000010002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00003E4000038000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00003E4000038002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0440000000000020L,0x0000000000000800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L,0x000000000001C008L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x7FE0000000000000L,0x00000000007C0003L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000000L,0x0000000003800000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x8000000000000000L});

}