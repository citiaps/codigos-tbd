<template>
  <div class="item">
      <div>
          <div class="image"></div>
      </div>
      <div>
          <h3>{{item.name}}</h3>
          <div>{{item.id}}</div>
      </div>
  </div>
</template>

<script>
export default {
    props:['item']
}
</script>

<style>

</style>
