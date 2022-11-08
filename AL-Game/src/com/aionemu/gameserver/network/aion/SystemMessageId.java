/**
 * This file is part of aion-emu <aion-emu.com>.
 *
 *  aion-emu is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-emu is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-emu.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.network.aion;

/**
 * @author KKnD
 */
public enum SystemMessageId {
	THE_WEAPON_HAS_BEEN_CHANGED(0x13D620),
	YOU_CAN_USE_IT_AFTER_REGISTERING_IT_ON_QUICKBAR(0x13D621),
	YOU_DONT_HAVE_MUCHFLIGHT_TIME_LEFT_LAND_ON_SECURE_PLACE(0x13D622),
	WARNING_YOU_DONT_HAVE_TOO_MUCH_FLIGHT_TIME_LEFT(0x13D623),
	YOU_SUFFERED_DAMAGE_AS_YOU_HAVE_SUBMERGED_DEEP_IN_THE_WATER(0x13D624),
	WARNING_YOU_SUFFERED_DAMAGE_AS_YOU_HAVE_SUBMERGED_DEEP_IN_THE_WATER(0x13D625),
	NO_TARGET_HAS_BEEN_SELECTED(0x13D626),
	INVALID_TARGET_YOU_CAN_ONLY_USE_THIS_ON_OBJECTS(0x13D627),
	INVALID_TARGET_YOU_CAN_ONLY_USE_THIS_ON_NPC(0x13D628),
	INVALID_TARGET_YOU_CAN_ONLY_USE_THIS_ON_OTHER_PLAYERS(0x13D629),
	YOU_DONT_HAVE_ENOUGH_DP_TO_US_THAT_SKILL(0x13D630),
	YOU_CANT_LEARN_DESIGN_BECAUSE_YOUR_SKILL_LEVEL_IS_NOT_HIGH_ENOUGH(0x13D631),
	YOU_DONT_HAVE_ENOUGH_$1_TO_USE_THE_SKILL(0x13D632),
	YOU_NEED_TOEQUIP_AOTHER_WEAPON_TO_USE_THAT_SKILL(0x13D633),
	YOU_HAVE_NOT_LEARNED_THE_$1_SKILL(0x13D634),
	YOU_ARE_NOT_READY_TO_USE_THAT_SKILL(0x13D635),
	YOU_ARE_TOO_FAR_FROM_TARGET_TO_USE_THAT_SKILL(0x13D636),
	THE_SKILL_WAS_CANCELED(0x13D637),
	YOU_HAVE_FAILED_TOTO_USE_SKILL_BECAUSE_TARGT_DISAPPEARED(0x13D638),
	YOU_ARE_USING_TOO_MANY_SKILLS_SIMULTANEOUSLY(0x13D639),
	YOUR_TARGET_IS_TOO_FAR_AWAY(0x13D640),
	YOU_CANT_ATTACK_BECAUSE_THERE_IS_OBSTACLE_IN_WAY(0x13D641),
	YOU_CANNOT_ATTACK(0x13D642),
	YOU_ACQUIRED_$1_TITLE_AS_QUEST_REWARD(0x13D643),
	A_SURVEI_HAS_ARRIVED_CLICKON_ICON_TO_OPEN_WINDOW(0x13D644),
	THERE_IS_NO_REMAINING_SURVEY_TO_TAKE_PART_IN(0x13D645),
	$1_IS_RUNNING_AWAY(0x13D646),
	$1_GIVES_UP_THE_PERSUIT(0x13D647),
	YOU_HAVE_DISCOVERED_ACARIOS_PLAINS(0x13D648),
	YOU_CANNOT_USE_AN_ITEM_WHILE_$1(0x13D650),
	$1_GIVES_UP_THE_ATTACK(0x13D651),
	YOU_LERNED_$1_LEVEL(0x13D652),
	YOU_STOPPED_USING_$1(0x13D653),
	THAT_SKILL_IS_NOT_BEING_USED(0x13D654),
	YOU_STOPPED_USING_$1_SKILL(0x13D655),
	THAT_SKILL_IS_NOT_BEING_USED_1(0x13D656),
	THE_$1_SKILL_EFFECT_HAS_BEEN_REMOVED(0x13D657),
	THE_$1_SKILL_EFFECT_CANNOT_BE_REMOVED(0x13D658),
	THE_$1_SKILL_EFFECT_CANNOT_BE_REMOVED_1(0x13D659),
	YOU_CANNOT_USE_THE_SKILL_WHILE_IN_ALTERED_STATE(0x13D660),
	YOUR_ACTIONS_ARE_LIMITED_WHILE_IN_ALTERED_STATE(0x13D661),
	YOU_CANNOT_ATTACK_WHILE_IN_ALTERED_STATE(0x13D662),
	YOU_CANNOT_GATHER_WHILE_IN_ALTERED_STATE(0x13D663),
	YOU_CANNOT_USE_THE_ITEM_WHILE_IN_ALTERED_STATE(0x13D664),
	YOU_CANNOT_EQUIP_THE_ITEM_WHILE_IN_ALTERED_STATE(0x13D665),
	$1_SKILL_FAILEDAS_THERE_ARE_ALREADY_TO_MANY_SKILLS_IN_EFFECT(0x13D666),
	YOU_CANNOT_USE_$1_SKILLIN_YOUR_CURRENT_STANCE(0x13D667),
	YOU_AREADY_HAVE_A_SPIRIT_FOLLOWING_YOU(0x13D668),
	AS_SPIRITIS_TOO_FAR_YOUR_SUMMON_HAS_BEEN_FORCIBLYCANCELED(0x13D669),
	YOU_DO_NOT_HAVE_ENOUGH_KINACHTO_RESURECT_CHARM_STONE(0x13D670),
	YOU_ARE_TOO_FAR_FROM_NPC_TO_RESURECT_IT(0x13D671),
	YOU_HAVE_RESURECTED_THE_PET(0x13D672),
	TRY_AGAIN_AFTER_YOU_HAVE_CLOSED_OTHER_DIALOG_BOXES(0x13D673),
	YOU_CANNOT_TRANSFER_EXP(0x13D674),
	AMOUNT_OF_EXP_TRANSFERED_TO_SPIRIT_IS_NOT_ENOUGH(0x13D675),
	$1_HAS_REACHED_LEVEL_$2(0x13D676),
	THERE_IS_NO_TARGET(0x13D677),
	INVALID_TARGET(0x13D678),
	YOU_CANNOT_USE_THIS_ON_ENEMIES(0x13D679),
	THERE_IS_NO_ONE_FOR_YOU_TO_CHALLANGE_TO_A_DUEL(0x13D680),
	$1_DECLINED_YOUR_CHALLANGE(0x13D681),
	YOU_WON_THE_DUEL_AGAINST_$1(0x13D682),
	YOU_LOST_THE_DUEL_AGAINS_$1(0x13D683),
	THE_DUEL_WITH_$1_ENDED_DUE_TO_TIME_LIMIT(0x13D684),
	YOU_ARE_TOO_FAR_FROM_$1_TO_START_DUEL(0x13D685),
	YOU_CANNOT_FIND_USER__YOU_HAVE_CHALLANGED_TO_DUEL(0x13D686),
	YOU_ARE_NOT_READY_TO_START_DUEL(0x13D687),
	DUEL_WITH_$1_ENDED_DUE_TO_TIME_LIMIT(0x13D688),
	YOU_CANNOT_USE_THAT_ON_YOUR_TARGET(0x13D689),
	SKILL_CAN_ONLY_BE_USED_FROM_REAR_OF_YOUR_OPPONENT(0x13D690),
	YOU_CAN_USE_THIS_SKILL_ONLY_WHILE_FLYING(0x13D691),
	YOU_CANNOT_USE_A_SKILL_WHILE_YOU_ARE_FLYING(0x13D692),
	ATTACKER_OR_TARGET_IS_IN_A_DIFFERENT_AREA(0x13D693),
	INVALID_TARGET2(0x13D694),
	CANNOT_EQUIP_SHIELD_YOU_HAVE_NOT_LEARNED_EQUIP_SHIELD_SKILL(0x13D695),
	YOU_CANNOT_ATTACK_IN_YOUR_CURRENT_STANCE(0x13D696),
	YOU_CANNOT_GATHER_IN_YOUR_CURRENT_STANCE(0x13D697),
	YOU_CANNOT_USE_THAT_ITEM_IN_YOUR_CURRENT_STANCE(0x13D698),
	YOU_CANNOT_CHANGE_EQUIPMENT_IN_YOUR_CURRENT_STANCE(0x13D699),
	THET_ITEM_DISTRIBUTION_METHOD_OF_ALLIANCE_HAS_BEEN_CHANGED_TO_FREE_FOR_ALL(0x13D700),
	THE_ITEM_DISTRIBUTION_METHOD_OF_ALLIANCE_HAS_BEEN_CHANGED_TO_ROUND_ROBIN(0x13D701),
	THE_ITEM_DISTRIBUTION_METHOD_OF_ALLIANCE_HAS_BEEN_CHANGED_TO_CAPTAIN(0x13D702),
	YOU_CANNOT_INVITE_SELECTED_PLAYER_AS_HE_OR_SHE_IS_TOO_BUSY(0x13D703),
	THAT_NAME_IS_INVALID_PLEASE_TRY_ANOTHER(0x13D704),
	YOU_ARE_TOO_FAR_AWAY_FROM_NPC_TO_CREATE_LEGION(0x13D705),
	TRY_AGAIN_LATER_AFTER_YOU_HAV_CLOSED_OTHER_DIALOG_BOXES(0x13D706),
	YOU_DONT_HAVE_ENOUGH_KINAH_TO_CREATE_LEGION(0x13D707),
	YOU_CANOT_CREATE_LEGION_AS_YOU_ARE_MEMMBER_OF_ANOTHER_LEGION(0x13D708),
	THAT_NAME_IS_INVALID_TRY_ANOTHER(0x13D709),
	$1_HAS_LEFT_THE_LEGION(0x13D710),
	YOU_HAVE_LEFT_THE_$1_LEGION(0x13D711),
	YOU_ARE_NOT_A_MEMMBER_OF_A_LEGION(0x13D712),
	YOU_CANNOT_KICK_YOURSELF_FROM_A_LEGION(0x13D713),
	YOU_DONT_HAVE_AUTH_TO_KICK_OUT_LEGION_MEMMBER(0x13D714),
	YOU_CANNOT_KICK_OUT_A_LEGION_MEMMBER_DURING_A_WAR(0x13D715),
	YOU_HAVE_BEEN_KICKED_FROM_$1_LEGION(0x13D716),
	$1_KICKED_OUT_FROM_LEGION(0x13D717),
	$1_IS_NOT_A_MEMMBER_OF_YOUR_LEGION(0x13D718),
	YOU_CANNOT_KICK_OUT_LEGION_BRIGADE_GENERAL(0x13D719),
	$1_IS_MEMMBER_OF_OTHER_LEGION(0x13D720),
	THERE_IS_NO_ROOM_IN_LEGION_FOR_MORE_MEMMBERS(0x13D721),
	YOU_HAVE_SENT_LEGION_INVITATION_TO_$1(0x13D722),
	$1_HAS_DECLINED_YOUR_LEGION_INVITATION(0x13D723),
	$1_HAS_JOINED_YOUR_LEGION(0x13D724),
	YOU_ARE_NOT_A_MEMMBER_OF_A_LEGION_1(0x13D725),
	YOU_CANT_CHANGE_RANKS_BECAUSE_YOUR_NOT_LEGION_BRIGADE_GENERAL(0x13D726),
	LEGION_BRIGAD_GENERAL_CANNOT_CHANGE_HIS_OWN_RANK(0x13D727),
	THERE_IS_NOONE_TO_CHANGE_RANK(0x13D728),
	$1_IS_NOT_MEMMBER_OF_YOUR_LEGION(0x13D729),
	$1_IS_NOT_MEMMBER_OF_YOUR_LEGION_2(0x13D730),
	$1_HAS_BECOME_LEGION_BRIGADE_GENERAL(0x13D731),
	YOU_CANNOT_JOIN_ALLIANCE_BECAUSE_YOUR_NOT_LEGION_BRIGADE_GENERAL(0x13D732),
	YOU_CANNOT_LEAVE_ALLIANCE_BECAUSE_YOUR_NOT_LEGION_BRIGADE_GENERAL(0x13D733),
	YOU_DONT_HAVE_AUTH_TO_MODIFY_LEGION_ANNOUNCMENT(0x13D734),
	LEGION_ANNOUNCMENT_HAS_BEEN_MODIFIED(0x13D735),
	YOU_MUST_BE_A_LEGION_MEMMBER_TO_USE_LEGION_WAREHOUSE(0x13D736),
	YOU_CANNOT_USE_LEGION_WAREHOUSE(0x13D737),
	ANOTHER_LEGION_MEMMBER_IS_USING_WARHOUSE_TRY_LATER(0x13D738),
	YOU_ARE_NOT_A_MEMMBER_OF_A_LEGION_2(0x13D739),
	YOU_CANNOT_YOIN_THE_LEGION(0x13D740),
	YOU_CANNOT_JOIN_LEGION_AS_PLAYER_WHO_INVITED_YOU_IS_DEAD(0x13D741),
	CURRENTLY_SELECTED_PLAYER_CANNOT_BE_INVITED_TO_LEGION(0x13D742),
	TARGET_IS_NOT_VALID_SELECT_A_PLAYER(0x13D743),
	YOUR_AUTH_CANNOT_BE_GRANTED_TO_THE_RANK(0x13D744),
	YOU_ARE_NOT_A_MEMMBER_OF_A_LEGION_3(0x13D745),
	YOU_ARE_NOT_A_MEMMBER_OF_THE_LEGION(0x13D746),
	TRY_AGAIN_LATER_AFTER_YOU_HAVE_CLOSED_OTHER_DIALOG_BOXES(0x13D747),
	YOU_ARE_TOO_FAR_FROM_NPC_TO_CANCEL_LEGION_DISBANDING(0x13D748),
	YOU_CANNOT_DISBAND_LEGION_DURING_WAR(0x13D749),
	YOU_HAVE_ALREADYREQUESTED_TO_DISBAND_LEGION(0x13D750),
	YOU_ARE_TOO_FAR_FROM_NPC_TO_DISBAND_LEGION(0x13D751),
	YOU_CANNOT_DELETE_CHARACTER_THAT_JOINED_LEGION(0x13D752),
	LEGION_DISBANDING_MODE_HAS_BEEN_CANCELED(0x13D753),
	DISBAND_STAND_BY_PERIOD_$1_DAYS(0x13D754),
	ONLY_LEGION_BRIGADE_GENERAL_CAN_CANCEL_DISBANDING_MODE(0x13D755),
	LEGION_IS_NOT_WAITING_TO_BE_DISBANDED(0x13D756),
	YOU_CANNOT_INVITE_MEMMBERS_OF_OTHER_RACE(0x13D757),
	YOU_ARE_NOT_MEMMBER_OF_THE_LEGION(0x13D758),
	YOU_DONT_HAVE_AUTH_TO_BESTOW_TITLE(0x13D759),
	YOUR_LEGION_IS_NOW_ON_LEVEL_$1(0x13D760),
	TRY_LATER_AFTER_CLOSING_OTHER_INPUT_BOXES(0x13D761),
	YOU_DONT_HAVE_AUTH_TO_USE_LEGION_WERHOUSE(0x13D762),
	LEGION_WAREHOUSE_IS_NOW_LOADING_TRY_LATER(0x13D763),
	YOUR_LEGION_DONTHAVE_ENOUGH_FUNDS(0x13D764),
	YOUR_TARGET_IS_BUSY_CANNOT_BE_INVITED_AT_THE_MOMENT(0x13D765),
	YOUR_TOO_FAR_FROM_NPC_TO_RAISE_LEGION_LEVEL(0x13D766),
	YOU_ARE_ALREADY_MEMMBER_OF_A_LEGION(0x13D767),
	YOU_CANNOT_JOIN_ANOTHER_LEGION_WHILE_YOUR_LEGION_TO_BE_CREATED(0x13D768),
	LEGION_YOU_WERE_TO_JOIN_NO_LONGER_EXISTS(0x13D769),
	$1_DOES_NOT_SELL_ITEMS(0x13D770),
	$1_DOES_NOT_BUY_ITEMS(0x13D771),
	YOU_ARE_TOO_AWAY_TO_TRADE(0x13D772),
	YOU_DONT_HAVE_ENOUGH_KINAH_TO_BUY_ITEM(0x13D773),
	YOU_HAVE_BOUGHT_THE_ITEM(0x13D774),
	SALES_COMPLETE(0x13D775),
	YOU_CANNOT_SELL_EQUIPPED_ITEMS(0x13D776),
	PRICE_OF_ITEM_HAS_CHANGED(0x13D777),
	$1_IS_NOT_AN_ITEM_THAT_CAN_BE_SOLD(0x13D778),
	CANT_REGISTER_ANY_MORE_ITEMS(0x13D779),
	YOU_ARE_TOO_FAR_FROM_TARGET_TO_TRADE(0x13D780),
	SEND_TRADE_MSG_TO_$1(0x13D781),
	EXCHANGE_HE_REJECTED_EXCHANGE(0x13D782),
	TARGET_ALREADY_TRADING(0x13D783),
	$1_CANNOT_TRADE_AT_THE_MOMENT(0x13D784),
	TARGET_HAS_TOO_MANY_ITEMS(0x13D785),
	$1_IS_NOT_A_TRADABLE_ITEM(0x13D786),
	YOU_CANT_TRADE_BECAUSE_TO_MANY_ITEMS(0x13D787),
	YOU_CANT_TRADE_BECAUSE_TARGET_HAS_LIMIT_OF_ITEM_$1(0x13D788),
	TRADE_COMPLETE(0x13D789),
	THIS_ITEM_CANT_BE_REGISTERED(0x13D790),
	THIS_IS_NOT_A_TRADABLE_ITEM(0x13D791),
	YOU_CANT_USE_SELLECTED_ITEM_UNTIL_$1_RANK(0x13D792),
	YOUR_CLASS_CANT_USE_THIS_ITEM(0x13D793),
	YOU_CANT_USE_$1_UNTIL_LEVEL_$2(0x13D794),
	YOUR_RACE_CANT_USE_THIS_ITEM(0x13D795),
	YOUR_NATIONALITY_PREVENTS_YOU_FROM_USING_THIS_ITEM(0x13D796),
	THIS_ITEM_CANT_BE_USED_BY_YOUR_GENDER(0x13D797),
	YOU_ARE_TOO_OVERBURNED_TO_PICK_UP_MORE_ITEMS(0x13D798),
	ANOTHER_PLAYER_HAS_FIRST_CHANCE_TO_PICK_UP_THIS_ITEM(0x13D799),
	YOU_HAVE_SUCCESSFULLY_SOULBOUND_$1(0x13D805),
	YOU_HAVE_FAILED_TO_SOULBOUND_$1(0x13D806),
	YOU_HAVE_CANCELED_SOULBOUND_OF_$1(0x13D807),
	TRY_SOULBOUND_AGAIN_AFTER_CLOSE_OTHER_INPUT_BOXES(0x13D808),
	YOU_CANNOT_SOULBIND_WHILE_$1(0x13D809),
	YOU_CANNOT_MAIL_EQUIPED_ITEMS(0x13D810),
	YOU_CANNOT_MAIL_ITEMS_NOT_TRADABLE(0x13D811),
	YOU_CANNOT_MAIL_ALREADY_USED_ITEMS(0x13D812),
	YOU_CANNOT_ATTACH_ANY_MORE_ITEMS(0x13D813),
	SELECTED_NPC_CANT_ADD_ABILYTY_TO_ITEM(0x13D814),
	YOU_ARE_TOO_FAR_FROM_NPC_TO_ADD_ABILITIES(0x13D815),
	FAILED_TO_FIND_ITEM_TO_ADD_ABILITY(0x13D816),
	YOU_CANNOT_ADD_ABILIETY_TO_EQUIPPED_ITEMS(0x13D817),
	$1_IS_NOT_AN_ITEM_YOU_CAN_ADD_ABILITY_TO(0x13D818),
	CANNOT_FIND_ITEM_TO_ADD_ABILITY_TO(0x13D819),
	$1_CANNOT_BE_DYED(0x13D820),
	ITEM_HAS_NOT_BEEN_DYED(0x13D821),
	ITEM_CANNOT_BE_FOUND(0x13D822),
	YOU_CANNOT_DYE_EQUIPPED_ITEMS(0x13D823),
	TARGET_BUSY_CANT_TRADE_AT_THE_MOMENT(0x13D824),
	$1_REPUTATION_HAS_INCREASED_BY_$2_POINTS(0x13D825),
	$1_REPUTATION_HAS_FALLEN_BY_$2_POINTS(0x13D826),
	$1_REPUTATION_HAS_BECOME_HOSTILE(0x13D827),
	$1_REPUTATION_HAS_BECOME_CONFRONTATIONAL(0x13D828),
	$1_REPUTATION_HAS_BECOME_NEUTRAL(0x13D829),
	THE_BRUGONS(0x13D830),
	THE_TIMORIS(0x13D831),
	$1_HR_$2_MIN_$3_SEC(0x13D832),
	$1_HR_$2_MIN(0x13D833),
	$1_HR_0_MIN_$2_SEC(0x13D834),
	$1_HR(0x13D835),
	$1_MIN_$2_SEC(0x13D836),
	$1_MIN(0x13D837),
	$1_SEC(0x13D838),
	CANT_CONNECT_TO_PETITION_SERVER(0x13D839),
	PROXY_PETITION_RECIVED_BY_GM_NUMBER_$1(0x13D840),
	SUPPORT_SERVICE_CANT_BE_USED_IN_HOURS_BETWEEN_$1_AND_$2(0x13D841),
	YOUR_SUPPORT_REQUEST_HAS_FAILE_TRY_LATER(0x13D842),
	YOU_HAVE_USED_ALL_PETITION_QUOTA_OF_$1_SUPPORT_PETITIONS_CANT_MAKE_MOR_TODAY(0x13D843),
	SUPPORT_PETITION_ALREADY_BEEN_RECIVED_WAIT_FOR_REPLY(0x13D844),
	PROXY_PETITION_FAILED_$1_ALREADY_RECIVED_SUPPORT_PETITION(0x13D845),
	PROXY_PETITION_FOR_$1_FAILED_ERROR_CODE_IS_$2(0x13D846),
	REQUEST_FOR_PROXY_PETITION_FAILED_USER_NOT_ONLINE_ERROR_CODE_IS_$1(0x13D847),
	PETITION_NO_$1_CANCELED(0x13D848),
	PETITION_CANCELED_YOU_HAVE_$2_SUPPORT_PETITONS_LEFT_TODAY(0x13D849),
	YOUR_CONSULTATION_WITH_GM_$1_HAS_STARTED(0x13D850),
	GM_$1_RESPONSE_IS_COMPLETE(0x13D851),
	YOU_ARE_NOT_INCONSULTATION_WITH_GM(0x13D852),
	ERROR_HAS_OCCURRED_WHILE_TRANSMITTING_CONVERSATION_LOG_TO_GM(0x13D853),
	$1_$2(0x13D854),
	MSG_FROM_GM_$1(0x13D855),
	ONLY_GROUP_LEADER_CAN_RECIVE_THIS_QUEST(0x13D856),
	YOU_CAN_TAKE_THIS_QUEST_WHEN_YOUR_GROUP_HAS_$1_OR_MORE_MEMMBERS(0x13D857),
	ONLY_LEGION_BRIGADE_GENERAL_CANRECIVE_THIS_QUEST(0x13D858),
	YOU_CANRECIVE_THIS_QUEST_WHEN_LEVEL_OF_LEGION_IS_$1_OR_ABOVE(0x13D859),
	YOUR_NATIONALITY_PREVENTS_YOU_FOM_RECIVING_THIS_QUEST(0x13D860),
	ONLY_MALES_CAN_RECIVE_THIS_QUEST(0x13D861),
	ONLY_FEMALES_CAN_RECIVE_THIS_QUEST(0x13D862),
	YOUR_GENDER_PREVENTS_YOU_FOM_RECIVING_THIS_QUEST(0x13D863),
	YOUR_CLASS_PREVENTS_YOU_FOM_RECIVING_THIS_QUEST(0x13D864),
	YOU_MUST_HAVE_$1_VOICE_TO_RECIVE_THIS_QUEST(0x13D865),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_YOU_NEED_$1_OR_LESS_TO_REACH_NEXT_LEVEL(0x13D866),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_YOUR_STIGMA_POINT_IS_$1_OR_ABOVE(0x13D867),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_YOUR_PVP_POINT_IS_$1_OR_ABOVE(0x13D868),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_$1_FAVOR_TOWAR_YOU_IS_$2_OR_ABOVE(0x13D869),
	YOU_MUST_HAVE_PLAYED_TOTAL_OF_ATLEAST_$1_HOURS_TORECIVE_THIS_QUEST(0x13D870),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_EQUIPPED_WITH_$1(0x13D871),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_YOU_HAVE_$1_IN_INVENTORY(0x13D872),
	YOU_MUST_BE_MEMMBER_OF_$1_NPC_LEGION_TO_RECIVE_THIS_QUEST(0x13D873),
	YOU_CAN_ONLY_RECIVE_THIS_QUEST_WHEN_YOU_HAVE_COMPLETED_$1_QUEST(0x13D874),
	YOU_CANT_RECIVE_QUEST_THAT_YOU_ALREADY_WORKING_ON(0x13D875),
	YOU_CANNOT_RECIVE_QUEST_WHILE_DEAD(0x13D876),
	YOU_CAN_DO_THE_$1_QUEST_ONLY_ONCE(0x13D877),
	YOU_CAN_DO_THE_$1_QUEST_ONLY_$2_TIMES(0x13D878),
	YOU_CANNOT_GET_QUEST_REWARD_WHILE_DEAD(0x13D879),
	QUEST(0x13D880),
	$1_ACQUIRE_$2_$3(0x13D881),
	$1_FAIL_$2_$3(0x13D882),
	$1_UPDATE_$2_$3(0x13D883),
	$1_COMPLETE_$2_$3(0x13D884),
	QUEST_ACQUIRED_$1(0x13D885),
	QUEST_FAILED_$1(0x13D886),
	QUEST_UPDATED_$1(0x13D887),
	QUEST_COMPLETE_$1(0x13D888),
	QUEST_ACQUIRED2_$1(0x13D889),
	$1_DISCONECTED_FROM_SERVER(0x13D890),
	THERE_IS_NO_USER_NAMED_$1(0x13D891),
	THERE_WILL_BE_IMPORTANT_ANNOUNCMENT_FROM_GM(0x13D892),
	$1_IS_NOT_PLAYING_THE_GAME(0x13D893),
	$1_HAS_BLOCKED_YOU(0x13D894),
	$1_IS_NOT_ACCEPTING_ANY_WHISPERS(0x13D895),
	NOTHING_HAPPEND(0x13D896),
	YOU_CANNOT_USE_TELEPORT_HERE(0x13D897),
	YOU_HAVE_UNBLOCKED_$1(0x13D898),
	YOU_HAVE_BLOCKED_$1(0x13D899),
	YOU_CANNOT_USE_SKILL_WHILE_FLYING(0x13D900),
	YOU_HAVE_DIED(0x13D901),
	YOU_HAVE_RESURECTED(0x13D902),
	$1_HAS_DEFEATED_$2(0x13D903),
	RESURECTION_WAIT_TIME_$1_SEC(0x13D904),
	USE_SKILL_TO_RESURECT(0x13D905),
	USE_ITEM_TO_RESURECT(0x13D906),
	PRESS_OK_TO_RESURECT(0x13D907),
	IT_WILL_BE_CANCELED_IF_YOU_DONT_PRESS_IN_$1_MINUTES(0x13D908),
	IT_WILL_BE_CANCELED_IF_YOU_DONT_PRESS_IN_$1_MINUTES2(0x13D909),
	$1_IS_HARD_TO_FIND_LOCATION(0x13D910),
	SEARCH_FOR_LOCATION_WAIT_MAX_30_SEC(0x13D911),
	$1_IS_LOCATED_AT_$3_OF_$2(0x13D912),
	YOU_CANNOT_QUIT_WHILE_IN_BATTLE(0x13D913),
	A_RIFT_CONNECTED_TO_ELYSEA_HAS_APPEARED(0x13D914),
	YOU_SPEND_$1_KINAH(0x13D915),
	TRADE_FAILED(0x13D916),
	YOU_DONT_HAVE_ENOUGH_KINAH(0x13D917),
	YOU_CAN_REGISTER__UP_TO_$1_ITEMS(0x13D918),
	THIS_ITEM_CANNOT_BE_TRADED(0x13D919),
	YOU_ENTERED_PVP_ZONE(0x13D920),
	YOU_LEFT_PVP_ZONE(0x13D921),
	START_DUEL(0x13D922),
	STOP_DUEL(0x13D923),
	YOU_CANNOT_DESTROY_EQUIPPED_ITEMS(0x13D924),
	PERMANENTLY_ACQUIRED_TITLE(0x13D925),
	TEMPORARILY_ACQUIRED_TITLE(0x13D926),
	$1_SKILL_LEVEL_$2(0x13D927),
	YOU_ALREADY_DESTROING_ANOTHER_ITEM(0x13D928),
	STARTING_DUEL_WITH_$1(0x13D929),
	YOU_HAVE_PURCHASED_$1(0x13D930),
	YOU_HAVE_PURCHASED_$2_$1(0x13D931),
	YOU_HAVE_SOLD_$1(0x13D932),
	YOU_HAVE_SOLD_$2_$1(0x13D933),
	YOU_HAVE_CRAFTED_$1(0x13D934),
	YOU_HAVE_CRAFTED_$2_$1(0x13D935),
	$1_HAS_BEEN_SOLD(0x13D936),
	$2_$1_HAS_BEEN_SOLD(0x13D937),
	YOU_HAVE_DISCARDED_$1(0x13D938),
	YOU_HAVE_DISCARDED_$2_$1(0x13D939),
	YOU_ARE_NOT_ALLOWED_TO_MOVE_FOR_$1_MINUTES_FOR_FOLLOWING_REASON(0x13D947),
	YOU_ARE_NOT_ALLOWED_TO_CHAT_FOR_$1_MINUTES_FOR_FOLLOWING_REASON(0x13D948),
	YOU_ARE_NOT_ALLOWED_TO_OPEN_PRIVATE_STORE_FOR_$1_MINUTES_FOR_FOLLOWING_REASON(0x13D949),
	UNKNOWN_ERROR(0x13D950),
	DATABASE_ERROR(0x13D951),
	SELECT_TYPE_OF_YOUR_PETITION(0x13D952),
	ENTER_YOUR_PETITION(0x13D953),
	YOU_ARE_NOT_ALLOWED_TO_EVALUATE_THE_REPLY_OF_A_SUPPORT_PETITION(0x13D954),
	THERE_ARE_UNFINISHED_REPLIES(0x13D955),
	ABANDON_SELECTED_QUEST(0x13D956),
	INVALID_TARGET3(0x13D957),
	YOU_CANT_USE_THIS_MENU_WHILE_YOU_ARE_DEAD(0x13D958),
	YOU_CANNOT_DESTROY_ITEM_WHILE_YOU_ARE_CORPSE(0x13D959),
	CANNOT_FIND_EMBLEM_BMP_IN_AION_GAME_FOLDER(0x13D960),
	$1_CANNOT_BE_SOCKETED_WITH_MANASTONE(0x13D961),
	YOU_CANNOT_IMPROVE_YOUR_CRAFTING_SKILL_ANY_FURTHER_TRY_EXPERT_PROMOTION_TEST(0x13D962),
	UPLOAD_OFLEGION_EMBLEM_TO_SERVER_SUCCESSFUL(0x13D963),
	UPLOAD_OFLEGION_EMBLEM_TO_SERVER_FAILED(0x13D964),
	FAILED_TO_READ_LEGION_EMBLEM_FILE(0x13D965),
	THE_SIZE_OF_LEGION_EMBLEM_FILE_IS_NOT_24_BIT_256x256(0x13D966),
	SKILL_PENALTY(0x13D967),
	REDUCES_EVASION_PARRY_AND_SHIELD_DEFENSE(0x13D968),
	REDUCES_PHYSICAL_DEFENSE_AND_MAGICAL_RESISTANCE(0x13D969),
	YOU_DONT_HAVE_ENOUGH_DP_FOR_CONVERSION(0x13D970),
	YOU_MUST_HAVE_LERNED_SKILL_TO_USE_IT(0x13D971),
	LEAVE_INSTANCE_NOT_PARTY(0x155CEA),

	// gathering
	YOU_HAVE_GATHERED_$1(1330016);

	private int _id;

	private SystemMessageId(int id) {
		_id = id;
	}

	public int getId() {
		return _id;
	}
}
