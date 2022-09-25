/*   Select * from public."Legs";*/

select public."Spears".spear_name, public."Chests".chest_name, public."Heads".head_name, public."Arms".arm_name, public."Legs".leg_name, public."Accessories".accessory_name
from public."Spears", public."Chests", public."Heads", public."Arms", public."Legs", public."Accessories"
where public."Spears".attack_speed + public."Chests".attack_speed +public."Heads".attack_speed +public."Arms".attack_speed +public."Legs".attack_speed + public."Accessories".attack_speed > 150
